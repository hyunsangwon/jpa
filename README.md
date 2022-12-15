### jpa
JPA 수업 😴 22.12.08 ~ 

### VSCode 필요한 확장프로그램
- Sprinb Boot Tools
- Gradle for Java
- Spring Boot Snippets
- Spring Boot Dashboard

### 프로젝트 구조
```bash
├── src
│   ├── controller
│   ├── service
│   ├── repository
│   └── model
├── resources
    └── application.yaml
``` 

#### 참고사이트
- https://www.bezkoder.com/spring-boot-jpa-crud-rest-api


### @ManyToOne에서 INSERT할 때
```json
{
    "id": 6,
    "name": "현상원",
    "salary": 3000,
    "age": 30,
    "dept": {
        "deptId": 1,
        "dname": null
    }
}
```