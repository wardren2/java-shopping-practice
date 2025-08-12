package javaproject.domain;

public class User {
    private String id;
    private String password;
    private String name;
    private String email;

    public User(String id, String password, String name, String email){
        this.id = id;
        this.password = password;
        this.name = name;
        this.email = email;
    }

    public String getId() { return id; }
    public String getName() { return name; }

    // 유효성 검증 메서드 추가 (버그 수정)
    public boolean isValid() {
        return id != null && !id.isEmpty() && password != null && password.length() >=6;
    }
}
