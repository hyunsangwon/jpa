### jpa
JPA μμ π΄ 22.12.08 ~ 

### VSCode νμν νμ₯νλ‘κ·Έλ¨
- Sprinb Boot Tools
- Gradle for Java
- Spring Boot Snippets
- Spring Boot Dashboard

### νλ‘μ νΈ κ΅¬μ‘°
```bash
βββ src
β   βββ controller
β   βββ service
β   βββ repository
β   βββ model
βββ resources
    βββ application.yaml
``` 

#### μ°Έκ³ μ¬μ΄νΈ
- https://www.bezkoder.com/spring-boot-jpa-crud-rest-api


### @ManyToOneμμ INSERTν  λ
```json
{
    "id": 6,
    "name": "νμμ",
    "salary": 3000,
    "age": 30,
    "dept": {
        "deptId": 1,
        "dname": null
    }
}
```