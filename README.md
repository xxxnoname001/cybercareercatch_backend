# cybercareercatch_backend
## 폴더 구조
```
CyberCareerCatch/
└── src/
    └── main/
        ├── java/
        │   └── com/
        │       └── ccc/
        │           ├── common/
        │           │   ├── config/
        │           │   │   ├── MyBatisConfig.java
        │           │   │   └── PropertyConfig.java
        │           │   ├── Execute.java
        │           │   └── Result.java
        │           │
        │           ├── account/
        │           │   └── controller/
        │           │       ├── LoginController.java
        │           │       ├── LogoutController.java
        │           │       ├── MemberSignupController.java
        │           │       ├── CompanySignupController.java
        │           │       └── FindPasswordController.java
        │           │
        │           ├── member/
        │           │   ├── controller/
        │           │   │   ├── MemberMypageController.java
        │           │   │   ├── MemberEditController.java
        │           │   │   └── MemberQuitController.java
        │           │   ├── dao/
        │           │   │   └── MemberDAO.java
        │           │   └── dto/
        │           │       └── MemberDTO.java
        │           │
        │           ├── company/
        │           │   ├── controller/
        │           │   │   ├── CompanyMypageController.java
        │           │   │   ├── CompanyEditController.java
        │           │   │   ├── CompanyQuitController.java
        │           │   │   └── CompanyInfoController.java
        │           │   ├── dao/
        │           │   │   └── CompanyDAO.java
        │           │   └── dto/
        │           │       └── CompanyDTO.java
        │           │
        │           ├── admin/
        │           │   ├── controller/
        │           │   │   ├── AdminLoginController.java
        │           │   │   ├── AdminMainController.java
        │           │   │   ├── MemberManageController.java
        │           │   │   ├── CompanyManageController.java
        │           │   │   └── RoadmapManageController.java
        │           │   ├── dao/
        │           │   │   └── AdminDAO.java
        │           │   └── dto/
        │           │       └── AdminDTO.java
        │           │
        │           ├── post/
        │           │   ├── controller/
        │           │   │   ├── PostListController.java
        │           │   │   ├── PostDetailController.java
        │           │   │   └── PostWriteController.java
        │           │   ├── dao/
        │           │   │   └── PostDAO.java
        │           │   └── dto/
        │           │       └── PostDTO.java
        │           │
        │           ├── qna/
        │           │   ├── controller/
        │           │   │   ├── QnaListController.java
        │           │   │   ├── QnaDetailController.java
        │           │   │   └── QnaWriteController.java
        │           │   ├── dao/
        │           │   │   └── QnaDAO.java
        │           │   └── dto/
        │           │       └── QnaDTO.java
        │           │
        │           ├── roadmap/
        │           │   ├── controller/
        │           │   │   ├── RoadmapQuestionController.java
        │           │   │   └── RoadmapResultController.java
        │           │   ├── dao/
        │           │   │   └── RoadmapDAO.java
        │           │   └── dto/
        │           │       ├── RoadmapDTO.java
        │           │       └── RoadmapQuestionDTO.java
        │           │
        │           ├── expo/
        │           │   ├── controller/
        │           │   │   ├── ExpoCalendarController.java
        │           │   │   └── ExpoDetailController.java
        │           │   ├── dao/
        │           │   │   └── ExpoDAO.java
        │           │   └── dto/
        │           │       └── ExpoDTO.java
        │           │
        │           └── job/
        │               ├── controller/
        │               │   └── JobGroupController.java
        │               ├── dao/
        │               │   └── JobGroupDAO.java
        │               └── dto/
        │                   └── JobGroupDTO.java
        │
        ├── resources/
        │   ├── context.properties
        │   ├── mybatis-config.xml
        │   └── mapper/
        │       ├── member/
        │       │   └── MemberMapper.xml
        │       ├── company/
        │       │   └── CompanyMapper.xml
        │       ├── admin/
        │       │   └── AdminMapper.xml
        │       ├── post/
        │       │   └── PostMapper.xml
        │       ├── qna/
        │       │   └── QnaMapper.xml
        │       ├── roadmap/
        │       │   └── RoadmapMapper.xml
        │       ├── expo/
        │       │   └── ExpoMapper.xml
        │       └── job/
        │           └── JobMapper.xml
        │
        └── webapp/
            ├── index.jsp
            ├── app/
            │   ├── common/
            │   │   ├── header/
            │   │   │   ├── header-logout.jsp
            │   │   │   ├── header-login-member.jsp
            │   │   │   └── header-login-company.jsp
            │   │   └── footer/
            │   │       └── footer.jsp
            │   │
            │   ├── account/
            │   │   ├── login.jsp
            │   │   ├── signup.jsp
            │   │   ├── signup-member.jsp
            │   │   ├── signup-company.jsp
            │   │   ├── user-agreement-member.jsp
            │   │   ├── user-agreement-company.jsp
            │   │   └── find-password.jsp
            │   │
            │   ├── mainpage/
            │   │   ├── mainpage-login.jsp
            │   │   └── mainpage-logout.jsp
            │   │
            │   ├── community/
            │   │   ├── post-list.jsp
            │   │   ├── post-detail.jsp
            │   │   ├── add-post.jsp
            │   │   └── post-notification.jsp
            │   │
            │   ├── member/
            │   │   ├── mypage-member.jsp
            │   │   ├── mypage-member-edit.jsp
            │   │   ├── mypage-member-edit-postlist.jsp
            │   │   ├── member-password-check.jsp
            │   │   └── mypage-member-quit.jsp
            │   │
            │   ├── company/
            │   │   ├── company-info.jsp
            │   │   ├── company-ad.jsp
            │   │   ├── mypage-company.jsp
            │   │   ├── mypage-company-edit.jsp
            │   │   ├── mypage-company-edit-jobposting.jsp
            │   │   ├── company-password-check.jsp
            │   │   └── mypage-company-quit.jsp
            │   │
            │   ├── qna/
            │   │   ├── qna-list.jsp
            │   │   ├── qna-detail.jsp
            │   │   └── add-qna.jsp
            │   │
            │   ├── roadmap/
            │   │   ├── roadmap-questionnaire1.jsp
            │   │   ├── roadmap-questionnaire2.jsp
            │   │   ├── roadmap-questionnaire3.jsp
            │   │   └── roadmap-questionnaire4.jsp
            │   │
            │   ├── expo/
            │   │   └── expo-calendar.jsp
            │   │
            │   └── admin/
            │       ├── admin-login.jsp
            │       ├── admin-main.jsp
            │       ├── member-management/
            │       │   ├── member-info.jsp
            │       │   ├── member-infodetail.jsp
            │       │   ├── company-check.jsp
            │       │   ├── company-checkdetail.jsp
            │       │   ├── recruiter-info.jsp
            │       │   └── recruiter-infodetail.jsp
            │       ├── main-management/
            │       │   ├── company-info.jsp
            │       │   ├── qna-management.jsp
            │       │   └── roadmap-management.jsp
            │       └── community-management/
            │           ├── community-management.jsp
            │           ├── company-qna.jsp
            │           ├── expo-schedule.jsp
            │           └── expodetail-schedule.jsp
            │
            ├── assets/
            │   ├── css/
            │   ├── js/
            │   └── img/
            │
            └── WEB-INF/
                ├── web.xml
                └── lib/
```