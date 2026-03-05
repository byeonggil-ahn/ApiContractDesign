# API Contract 기반 외부 Open API 연동 프로젝트

Spring Boot 기반의 웹 애플리케이션으로,  
본 프로젝트는 외부 Open API를 단순히 호출하는 것을 넘어 **API Contract 기반 설계의 구조적 의미와 실무적 가치를 이해하기 위해 진행되었습니다.**

외부 서비스 API와 내부 애플리케이션 사이에 명확한 계약 구조를 두어 **외부 API 의존성을 줄이고 유지보수성을 높이는 설계 방식**을 학습하는 것을 목표로 하였습니다.

---

## 프로젝트 개요

- **프로젝트명**: API Contract Design
- **개발 목적**
  - 외부 Open API 연동 과정 이해
  - API Contract 기반 설계 방식 학습
  - 외부 API와 내부 서비스 간 의존성 분리
  - 외부 API 응답 데이터를 내부 구조로 변환하는 설계 경험
- **사용 API**: Naver Open API
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

## 설계 포인트

- Controller는 HTTP 요청 및 응답 처리만 담당하도록 설계
- 외부 Open API 호출 로직을 Service 계층으로 분리
- 외부 API 응답 데이터를 내부 DTO로 변환하여 사용
- 외부 API 응답 구조에 직접 의존하지 않도록 API Contract 개념 적용
- 외부 서비스와 내부 비즈니스 로직 간 결합도 최소화

---

## 프로젝트를 통해 얻은 경험

본 프로젝트를 통해 외부 Open API를 단순히 호출하는 것에 그치지 않고,
외부 서비스와 내부 애플리케이션 사이의 의존성을 어떻게 관리할 것인지에 대해 고민할 수 있었습니다.

특히 외부 API 응답 구조를 그대로 사용하는 것이 아니라,
내부 시스템에서 사용하는 DTO 구조로 변환하여 사용하는 과정에서
API Contract 기반 설계의 필요성을 이해할 수 있었습니다.

또한 Controller와 Service 계층을 분리하여 API 호출 흐름을 구성하면서
외부 서비스 연동 시 책임 분리와 유지보수성을 고려한 설계의 중요성을 경험할 수 있었습니다.

이 경험은 이후 다양한 외부 API를 연동하는 과정에서
보다 안정적인 구조로 서비스를 설계하는 기반이 될 것으로 생각합니다.계의 중요성**을 체감할 수 있었습니다.
