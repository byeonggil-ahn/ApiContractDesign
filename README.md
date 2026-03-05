# Naver Open API 연동 프로젝트 (API Contract Design)

Spring Boot 기반의 웹 애플리케이션으로,  
본 프로젝트는 외부 Open API를 활용하여 **OAuth 인증 흐름과 API 호출 구조**를 이해하고 구현하기 위해 진행되었습니다.  

API 연동과 구조 이해가 본 프로젝트의 주된 목적이므로, 기존 Layered Architecture 프로젝트의 폴더 구조를 가져와  
기존 코드를 삭제하지 않고, API 구현을 위한 코드를 덧붙이는 형식으로 진행하였습니다.  

프로젝트는 로컬 개발 환경(Localhost)에서 구현되었습니다.

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
Controller (`/api/naver/login`)  
↓  
Naver OAuth 인가 요청  
↓  
Naver → Callback 호출  
↓  
Controller (`/api/naver/callback`)  
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


- **Controller** : HTTP 요청 처리 및 Service 위임  
- **Service** : 외부 API 호출 및 비즈니스 로직 처리  
- **Repository** : 데이터 저장소 접근  
- **Domain** : 애플리케이션에서 사용하는 도메인 객체  
- **DTO** : 요청 데이터 전달 객체   

---

## 프로젝트를 통해 얻은 경험

본 프로젝트는 로컬 개발 환경(Localhost)에서 네이버 Open API를 연동하여  
외부 서비스와 내부 애플리케이션 간 데이터 흐름을 설계하는 것을 목표로 구현하였습니다.  
외부 API를 단순히 호출하는 것에 그치지 않고,OAuth 인증 과정을 기반으로 access_token을 발급받고,  
해당 토큰을 이용하여 사용자 정보를 조회하는 전체 API 호출 흐름을 직접 구현하였습니다.  
특히 네이버 Open API에서 전달되는 JSON 형식의 응답 데이터를 처리하는 과정에서 access_token을 추출하고  
Authorization 헤더에 토큰을 포함하여 사용자 프로필 조회 API를 호출하는 구조를 구현하면서  
외부 인증 기반 API 연동 흐름을 이해할 수 있었습니다.  
또한 Controller와 Service 계층을 분리하여 HTTP 요청 처리와 외부 API 호출 로직의 책임을 나누는 구조로 설계하면서  
외부 API 연동 시 유지보수성과 확장성을 고려한 설계 경험을 할 수 있었습니다.
이 경험을 통해 외부 Open API 기반 서비스를 개발할 때  
OAuth 인증 흐름, JSON 데이터 처리 방식, 그리고 API 호출 구조를 어떻게 설계해야 하는지에 대한 이해를 얻을 수 있었습니다.
