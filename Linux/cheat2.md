## 파이프, 필터, 리디렉션 

#### 파이프 2개의 프로그램을 연결해주는 연결 통로
> ls -l /etc | less

#### 필터 필요한 것만 걸러주는 명령어
※ grep, tail, wc, sort, awk, sed 등등
> ps -ef | grep bash

#### 리디렉션 입출력의 방향을 바꿔줌, 표준 입력은 키보드, 표준 출력은 모니터이지만 이를 파일로 처리하고 싶을 때 주로 사용

## 프로세스, 데몬, 서비스 
#### 프로세스 하드디스크에 저장된 실행코드(프로그램)가 메모리에 로딩되어 활화 된 것

> ##### 포그라운드 프로세스
> ##### 백그라운드 프로세스
> ##### 프로세스 번호
> ##### 작업 번호
> ##### 부모 프로세스와 자식 프로세스


#### 프로세스 관련 명령어
> ##### ps 현재 프로세스의 상태 확인하는 명령어
> ##### kill 프로그램 종료 명령어 강제 종료는 '-9' 
> ##### pstree 부모 프로세스와 자식 프로세스의 관계를 트리 형태로

### 프로세스 is 데몬

### 시스템 서비스 실행 멸령어
	서비스 시작/중지/재시작
    	-> systemctl start/stop/restart 서비스이름
    서비스 상태 확인
    	-> systemctl status 서비스이름
    서비스 사용/사용 안함 설정
    	-> systemctl enable/disable 서비스이름

## 소켓 
