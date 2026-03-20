<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
/*
 * 로그인하지 않은 관리자는
 * 기업 정보페이지 관리 화면에 접근할 수 없도록 막는다.
 */
if (session.getAttribute("adminNumber") == null) {
	response.sendRedirect(request.getContextPath() + "/admin/login.adfc");
	return;
}
%>
<!DOCTYPE html>
<html lang="ko">

<head>
    <meta charset="UTF-8">
    <title>기업 정보페이지 관리</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/admin/main-management/company-info.css">
</head>

<body class="companyInfo-body">

    <div class="companyInfo-ctr">

        <header class="companyInfo-hdr">

            <!-- 관리자 메인으로 이동하는 타이틀 -->
            <div class="companyInfo-title">
                <a href="${pageContext.request.contextPath}/app/admin/admin-main.jsp">관리자 페이지</a>
            </div>

            <!-- 상단 메뉴 -->
            <nav class="companyInfo-nav">
                <a href="${pageContext.request.contextPath}/app/admin/member-management/member-info.jsp">회원 관리</a>
                <a href="${pageContext.request.contextPath}/admin/insertQuestion.adfc">메인 관리</a>
                <a href="${pageContext.request.contextPath}/app/admin/community-management/expo-schedule.jsp">커뮤니티 관리</a>
            </nav>

            <!-- 로그아웃 버튼 -->
            <a href="${pageContext.request.contextPath}/admin/logout.adfc" class="companyInfo-logout">로그아웃</a>
        </header>

        <main class="companyInfo-main">

            <!-- 왼쪽 사이드 메뉴 -->
            <aside class="companyInfo-leftbar">

                <div class="companyInfo-left-item">
                    <a href="${pageContext.request.contextPath}/admin/insertQuestion.adfc">질의문 관리</a>
                </div>

                <div class="companyInfo-left-item companyInfo-active">
                    <a href="${pageContext.request.contextPath}/admin/companyInfoListOk.adfc">기업 정보페이지</a>
                </div>

                <div class="companyInfo-left-item">
                    <a href="${pageContext.request.contextPath}/admin/roadmapManagement.adfc">로드맵 관리</a>
                </div>

            </aside>

            <!-- 오른쪽 콘텐츠 영역 -->
            <section class="companyInfo-ct">

                <!-- 페이지 제목 -->
                <div class="companyInfo-topbox">
                    <h2 class="companyInfo-subtitle">기업 정보 목록</h2>
                </div>

                <!-- 검색 폼 -->
                <form action="${pageContext.request.contextPath}/admin/companyInfoListOk.adfc" method="get" class="companyInfo-searchForm">
                    <div class="companyInfo-search">
                        <input type="text" name="keyword" value="${keyword}" placeholder="기업명 검색">
                        <button type="submit">검색</button>
                    </div>
                </form>

                <!-- 삭제 폼 -->
                <form id="companyDeleteForm" action="${pageContext.request.contextPath}/admin/deleteCompanyInfo.adfc" method="post">

                    <input type="hidden" name="page" value="${page}">
                    <input type="hidden" name="keyword" value="${keyword}">

                    <!-- 테이블 헤더 -->
                    <div class="companyInfo-tblHead">
                        <div class="col1">선택</div>
                        <div class="col2">번호</div>
                        <div class="col3">기업명</div>
                        <div class="col4">상태</div>
                        <div class="col5">주소</div>
                    </div>

                    <!-- 목록 -->
                    <c:choose>
                        <c:when test="${empty companyList}">
                            <div class="companyInfo-empty">등록된 기업 정보페이지가 없습니다.</div>
                        </c:when>

                        <c:otherwise>
                            <c:forEach var="company" items="${companyList}">
                                <div class="companyInfo-row">
                                    <div class="col1">
                                        <input type="checkbox" name="companyNumber" value="${company.companyNumber}">
                                    </div>
                                    <div class="col2">${company.companyNumber}</div>
                                    <div class="col3">${company.companyName}</div>
                                    <div class="col4">${company.companyState}</div>
                                    <div class="col5">${company.companyAddress}</div>
                                </div>
                            </c:forEach>
                        </c:otherwise>
                    </c:choose>

                    <!-- 페이지네이션 -->
                    <c:if test="${total > 0}">
                        <div class="companyInfo-page">

                            <c:choose>
                                <c:when test="${prev}">
                                    <a href="${pageContext.request.contextPath}/admin/companyInfoListOk.adfc?page=${startPage - 1}&keyword=${keyword}">&lt;</a>
                                </c:when>
                                <c:otherwise>
                                    <span class="companyInfo-page-disabled">&lt;</span>
                                </c:otherwise>
                            </c:choose>

                            <c:forEach var="i" begin="${startPage}" end="${endPage}">
                                <c:choose>
                                    <c:when test="${i == page}">
                                        <span class="active">${i}</span>
                                    </c:when>
                                    <c:otherwise>
                                        <a href="${pageContext.request.contextPath}/admin/companyInfoListOk.adfc?page=${i}&keyword=${keyword}">${i}</a>
                                    </c:otherwise>
                                </c:choose>
                            </c:forEach>

                            <c:choose>
                                <c:when test="${next}">
                                    <a href="${pageContext.request.contextPath}/admin/companyInfoListOk.adfc?page=${endPage + 1}&keyword=${keyword}">&gt;</a>
                                </c:when>
                                <c:otherwise>
                                    <span class="companyInfo-page-disabled">&gt;</span>
                                </c:otherwise>
                            </c:choose>

                        </div>
                    </c:if>

                    <!-- 삭제 버튼 -->
                    <div class="companyInfo-del">
                        <button type="submit">삭제</button>
                    </div>

                </form>

            </section>
        </main>
    </div>

    <script src="${pageContext.request.contextPath}/assets/js/admin/main-management/company-info.js"></script>
</body>

</html>