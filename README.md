# Naver Open API 연동 프로젝트 (API Contract Design)

Spring Boot 기반의 웹 애플리케이션으로,  
본 프로젝트는 외부 Open API를 활용하여 **OAuth 인증 흐름과 API 호출 구조를 이해하기 위해 진행되었습니다.**

특히 네이버 로그인 API를 활용하여  
인가 코드 발급 → access_token 발급 → 사용자 정보 조회까지의  
**OAuth 기반 API 연동 과정을 직접 구현하는 것을 목표로 하였습니다.

---

## 프로젝트 개요

- **프로젝트명**: Naver Open API 연동 프로젝트
- **개발 목적**
  - 외부 Open API 연동 구조 이해
  - OAuth 인증 기반 API 호출 흐름 경험
  - Controller와 Service 계층 분리를 통한 책임 분리 설계 경험
- **개발 인원**: 1명 (개인 프로젝트)
- **개발 환경**: Eclipse 기반 STS 3

---

## 기술 스택

| 구분 | 기술 |
|----|----|
| Language | Java 17 |
| Framework | Spring Boot |
| IDE | Eclipse (STS 3) |
| Web | Spring MVC |
| HTTP Client | RestTemplate |
| Data Format | JSON |
| Build Tool | Gradle |

---

## 프로젝트 구조

```
controller
 └─ UserController

service
 ├─ UserService
 └─ UserServiceImpl

domain
 └─ User

dto
 └─ UserRequestDto

repository
 └─ UserRepository
```

레이어드 아키텍처 구조를 기반으로  
Controller는 HTTP 요청을 처리하고,  
Service 계층에서 외부 Open API 호출 로직을 담당하도록 책임을 분리하였습니다.

---

## API 요청 흐름

```
Client
  ↓
Controller (/api/naver/login)
  ↓
Naver OAuth 인가 요청
  ↓
Naver → callback 호출
  ↓
Controller (/api/naver/callback)
  ↓
Service
  ↓
Access Token 요청
  ↓
Naver 사용자 정보 API 호출
  ↓
JSON 응답 수신
  ↓
Client Response
```

---

## 설계 포인트

- Controller는 HTTP 요청/응답 처리만 담당
- 외부 API 호출 로직은 Service 계층에서 처리
- RestTemplate을 사용한 Open API 연동 구현
- JSON 응답 데이터를 파싱하여 필요한 데이터 추출
- OAuth 인증 기반 API 호출 흐름 구현

---

## 프로젝트를 통해 얻은 경험

본 프로젝트를 통해 외부 Open API를 단순히 호출하는 것에 그치지 않고,  
외부 서비스와 내부 애플리케이션 사이의 데이터 흐름을 어떻게 설계할 것인지에 대해 고민할 수 있었습니다.

특히 네이버 Open API로부터 전달되는 JSON 응답 데이터를 처리하는 과정에서  
access_token을 추출하고 사용자 정보를 조회하는 API 호출 흐름을 직접 구현하면서  
외부 인증 기반 API 연동 구조를 이해할 수 있었습니다.

또한 Controller와 Service 계층을 분리하여  
HTTP 요청 처리와 외부 API 호출 로직의 책임을 나누는 방식으로  
유지보수성과 확장성을 고려한 설계의 중요성을 경험할 수 있었습니다.

이 경험을 통해 외부 Open API를 활용하는 서비스에서  
OAuth 인증 흐름과 API 호출 구조를 설계하는 과정의 중요성을 이해할 수 있었습니다.
