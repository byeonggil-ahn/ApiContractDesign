# API Contract 기반 외부 Open API 연동 프로젝트

Spring Boot 기반의 웹 애플리케이션으로,
본 프로젝트는 외부 Open API를 단순히 호출하는 것에 그치지 않고 API Contract를 중심으로 한 구조적 설계 방식을 이해하기 위해 진행되었습니다.

외부 서비스와 직접적으로 결합된 구조가 아닌, 내부 애플리케이션과 외부 API 사이에 명확한 계약 계층을 두어 의존성을 분리하는 설계 방식을 학습하는 것을 목표로 하였습니다.

# 프로젝트 개요

프로젝트명: API Contract Design
개발 목적

외부 Open API 연동 과정 이해

API Contract 기반 설계 방식 학습

외부 API와 내부 서비스 간 의존성 분리

외부 API 응답 데이터를 내부 도메인 구조로 변환하는 설계 경험

사용 API: Naver Open API

개발 인원: 1명 (개인 프로젝트)
개발 환경: Eclipse 기반 STS 3

## 기술 스택

| 구분 | 기술 |
|---|---|
| Language | Java 17 |
| Framework | Spring Boot |
| IDE | Eclipse (STS 3) |
| Web | Spring MVC |
| HTTP Client | RestTemplate |
| Data Format | JSON |
| Build Tool | Gradle |

Controller 계층에서는 HTTP 요청과 응답 처리만 담당하도록 설계

외부 API 호출 로직은 Service 계층으로 분리

외부 API의 응답 데이터를 내부 DTO로 변환하여 사용

외부 API 응답 구조에 직접 의존하지 않도록 API Contract 개념 적용

외부 서비스와 내부 비즈니스 로직 간 의존성 최소화

설계 관점에서의 정리

외부 Open API를 사용하는 경우, API 응답 구조에 애플리케이션이 직접적으로 의존하게 되면 외부 서비스의 변경 사항이 내부 시스템 전체에 영향을 줄 수 있습니다.

본 프로젝트에서는 이러한 문제를 줄이기 위해 외부 API와 내부 서비스 사이에 API Contract 계층을 두는 방식으로 설계를 진행하였습니다.

이를 통해 외부 API의 응답 데이터를 내부 시스템에서 사용하는 DTO와 도메인 구조로 변환하여 사용하도록 구성하였으며, 외부 서비스와 내부 비즈니스 로직 간의 결합도를 낮추는 설계 방식을 경험할 수 있었습니다.

또한 API 호출 흐름을 Controller → Service → External API 구조로 분리함으로써 유지보수성과 확장성을 고려한 설계의 중요성을 이해할 수 있었습니다.
