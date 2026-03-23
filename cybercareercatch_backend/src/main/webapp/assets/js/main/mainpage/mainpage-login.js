document.addEventListener("DOMContentLoaded", function () {
    const container = document.querySelector(".mainpage-main-container");
    const companyAdMoreLink = document.getElementById("mainpage-companyad-more-link");
    const form = document.getElementById("mainQuestionForm");
    const answerInput = document.getElementById("mainpage-searchjob-answer");
    const searchImg = document.getElementById("searchimg");
    const hiddenSubmitButton = document.getElementById("mainpage-hidden-submit");

    const answerLengthModal = document.getElementById("mainpage-answer-length-modal");
    const answerLengthModalMessage = document.getElementById("mainpage-answer-modal-message");
    const answerLengthModalClose = document.getElementById("mainpage-answer-modal-close");
    const answerLengthModalConfirm = document.getElementById("mainpage-answer-modal-confirm");

    const ANSWER_MAX_LENGTH = 1000;
    let isSubmitting = false;

    function openAnswerLengthModal(message) {
        if (!answerLengthModal || !answerLengthModalMessage) {
            alert(message);
            return;
        }

        answerLengthModalMessage.textContent = message;
        answerLengthModal.classList.add("show");
        answerLengthModal.setAttribute("aria-hidden", "false");
        document.body.style.overflow = "hidden";
    }

    function closeAnswerLengthModal() {
        if (!answerLengthModal) {
            return;
        }

        answerLengthModal.classList.remove("show");
        answerLengthModal.setAttribute("aria-hidden", "true");
        document.body.style.overflow = "";
    }

    function enforceAnswerMaxLength() {
        if (!answerInput) {
            return;
        }

        if (answerInput.value.length > ANSWER_MAX_LENGTH) {
            answerInput.value = answerInput.value.slice(0, ANSWER_MAX_LENGTH);
            openAnswerLengthModal("1000자 이내로 입력해주세요.");
        }
    }

    if (answerInput) {
        answerInput.focus();

        answerInput.addEventListener("input", function () {
            enforceAnswerMaxLength();
        });

        answerInput.addEventListener("paste", function () {
            setTimeout(function () {
                enforceAnswerMaxLength();
            }, 0);
        });
    }

    if (answerLengthModalClose) {
        answerLengthModalClose.addEventListener("click", function () {
            closeAnswerLengthModal();
            if (answerInput) {
                answerInput.focus();
            }
        });
    }

    if (answerLengthModalConfirm) {
        answerLengthModalConfirm.addEventListener("click", function () {
            closeAnswerLengthModal();
            if (answerInput) {
                answerInput.focus();
            }
        });
    }

    if (answerLengthModal) {
        answerLengthModal.addEventListener("click", function (event) {
            if (event.target === answerLengthModal) {
                closeAnswerLengthModal();
                if (answerInput) {
                    answerInput.focus();
                }
            }
        });
    }

    document.addEventListener("keydown", function (event) {
        if (event.key === "Escape" && answerLengthModal && answerLengthModal.classList.contains("show")) {
            closeAnswerLengthModal();
            if (answerInput) {
                answerInput.focus();
            }
        }
    });

    if (companyAdMoreLink) {
        companyAdMoreLink.addEventListener("click", function () {
            const isLoginRequired = companyAdMoreLink.dataset.loginRequired === "true";

            if (isLoginRequired) {
                alert("기업 홍보 페이지는 로그인 후 이용할 수 있습니다.");
            }
        });
    }

    if (searchImg && hiddenSubmitButton) {
        searchImg.addEventListener("click", function () {
            hiddenSubmitButton.click();
        });
    }

    if (form && answerInput) {
        form.addEventListener("submit", function (event) {
            const answerValue = answerInput.value.trim();

            if (!answerValue) {
                event.preventDefault();
                alert("답변을 입력해주세요.");
                answerInput.focus();
                return;
            }

            if (answerInput.value.length > ANSWER_MAX_LENGTH) {
                event.preventDefault();
                answerInput.value = answerInput.value.slice(0, ANSWER_MAX_LENGTH);
                openAnswerLengthModal("1000자 이내로 입력해주세요.");
                answerInput.focus();
                return;
            }

            isSubmitting = true;
        });
    }

    if (container) {
        const resetUrl = container.dataset.resetUrl;
        const isTestInProgress = container.dataset.testInProgress === "true";

        if (resetUrl && isTestInProgress) {
            window.addEventListener("pagehide", function () {
                if (isSubmitting) {
                    return;
                }

                try {
                    if (navigator.sendBeacon) {
                        navigator.sendBeacon(resetUrl);
                    } else {
                        fetch(resetUrl, {
                            method: "POST",
                            keepalive: true
                        });
                    }
                } catch (e) {
                    console.log("직군검사 초기화 요청 실패", e);
                }
            });
        }
    }
});