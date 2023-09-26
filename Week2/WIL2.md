1.
 HTTP는 HyperText Transfer Protocol의 약자로 서로 다른 시스템들 사이에서 통신을 주고 받게 해주는 application 계층의 protocol이다. 웹에서만 사용하는 프로토콜로 TCP/IP 기반으로 서버와 클라이언트 간의 요청과 응답을 전송한다.
 HTTP의 특징으로는 클라이언트와 서버가 한번 연결을 맺은 후에 클라이언트의 요청에 대해 서버가 응답을 마치면 연결을 끊어버리는 비연결성과 Connectionless로 인해 서버가 두 요청간의 어떠한 데이터도 유지하지 않아 서버가 클라이언트를 식별하지 못하는 무상태성이 있다.

 HTTP의 연결 과정은 < TCP연결을 열어준다 -> HTTP메시지 전송 -> 서버가 보낸 응답을 읽는다 -> 연결을 닫거나 다른 요청을 위해 재사용한다 >이다.
 HTTP는 HTTP message를 통해 데이터를 주고받으며 HTTP 메시지에는 request와 response가 있으며 http method, 경로, http 버전, header로 이루어져 있다.

 클라이언트가 서버에 특정 요청을 보낼때, 웹서버에게 요청하는 목적 및 그 종류를 알리는 수단으로 HTTP Method를 사용하는데 주로 리소스를 조회하는 GET, 요청 데이터를 처리하는 POST, 리소스를 대체하고 해당 리소스가 없으면 생성하는 PUT, 리소스 부분 변경하는 PATCH, 리소스를 삭제하는 DELETE 등이 있다.

 HTTP 상태 코드는 서버측에서 클라이언트로 요청에 대한 응답을 보낼 때, 해당 요청에 관한 처리 상태를 알려주는 기능이다. 1xx (Informational): 요청이 수신되어 처리중, 2xx (Successful): 요청 정상 처리, 3xx (Redirection): 요청을 완료하려면 추가 행동이 필요, 4xx (Client Error): 클라이언트 오류, 잘못된 문법등으로 서버가 요청을 수행할 수 없음, 5xx (Server Error): 서버 오류, 서버가 정상 요청을 처리하지 못함이다.


2.
  HTTPS는 HyperText Transfer Protocol over Secure Socket Layer의 약자로 통신의 인증과 암호화를 위해 넷스케이프 커뮤니케이션즈 코퍼레이션이 개발한 넷스케이프 웹 프로토콜이다. HTTPS는 소켓 통신에서 일반 텍스트를 이용하는 대신에, SSL이나 TLS 프로토콜을 통해 세션 데이터를 암호화하여 데이터의 적절한 보호를 보장한다.

  HTTPS는 HTTP의 보안이 강화된 버전으로 SSL은 서버와 브라우저 사이에 안전하게 암호화된 연결을 만들 수 있게 도와주어 누군가 훔쳐가더라도 해독할 수 없게 만든다. 또 사용자들은 안전하다고 느끼는 사이트를 많이 방문하기에 HTTPS는 검색엔진 최적화(SEO)에 있어서도 큰 혜택을 볼 수 있다.


3.

이벤트 목록 조회                   GET /events
이벤트 조회                        GET /events/{eventId}    
이벤트 등록                        POST /events        
이벤트 수정                        PUT /events/{eventId}     
이벤트 삭제                        DELETE /events/{eventId}    
이벤트 상태 변경                   PATCH /events/{eventId}/states 
특정 이벤트의 주문 목록 조회        GET /events/{eventId}/order
멤버 목록 조회                     GET /members
특정 멤버 권한 변경                PATCH /members/{memberId}/permission
특정 멤버 정보 조회                GET /members/{memberId}/information
특정 멤버 정보 변경                PUT /memebers/{memberId}/information
멤버 등록                         POST /members