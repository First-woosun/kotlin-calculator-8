# kotlin-calculator-precourse

## 🚀구현 기능 목록

1. **입력 문자열 파싱 및 게산**
   - [ ] **빈 문자열/null 처리** : 0 반환
   - [ ] **입력 값이 하나** : 해당 입력값 반환
   - [ ] **기본 구분자** : 쉼표(,) 또는 콜론(:)을 구분자로 사용하여 숫자를 분리하고 합산
   - [ ] **커스텀 구분자** :  "//"와 "\n" 사이에 위치하는 문자를 구분자로 지정 ex) 
     - //(.)\n => (.)
2. **예외 처리**
   - [ ] **음수 예외** : 숫자 중 음수 발견 시 IllegalArgumentException 발생 후 종료
   - [ ] **잘못된 값 예외** : 숫자 이외의 문자열 발견 시 IllegalArgumentException 발생 후 종료
   
3. **입출력 요구 사항**
   - [ ] camp.nextstep.edu.missionutils.Console의 readLine()을 사용하여 사용자 입력
   - [ ] 덧샘 결과 "결과 : {합산 값}" 형태로 출력
