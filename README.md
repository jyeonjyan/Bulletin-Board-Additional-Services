# 게시물 서비스의 부가적 기능 구축
## 📄 Function
> **1. 게시물 조회 수 집계**  
> **2. 게시물에 댓글 입력**  
> **3. 댓글 수 집계**
## 💁🏻‍♀️ Dependency
> Lombok  
> Spring Web  
> H2 Database  
> Validation  
> Spring Data JPA

## ✅ API Testing 
### POST
```bash
localhost:8080/board/post
```
### View -> Hit
```bash
localhost:8080/board/view{postIdx}
```
### CommentPost
```bash
http://localhost:8080/comment/write?postIdx={postIdx}
```
### CommentUpdate
```bash
http://localhost:8080/comment/update?commentIdx={commentIdx}
```
