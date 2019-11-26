package com.javaex.problem02;

public class Friend {
	 private String name;
	    private String hp;
	    private String school;

	    
	    //필요한 메소드 작성
	    public String getName() {
	    	return name;
	    }
	    public String getHp() {
	    	return hp;
	    }
	    public String getSchool() {
	    	return school;
	    }
	    
	    
	    public void setName(String name) {
	    	this.name=name;
	    }
	    public void setHp(String hp) {
	    	this.hp=hp;
	    }
	    public void setSchool(String school) {
	    	this.school=school;
	    }
	    
	    public void showInfo(){
	        System.out.println("이름:"+name+"  핸드폰:"+hp+"  학교:"+school);
	    }

}
