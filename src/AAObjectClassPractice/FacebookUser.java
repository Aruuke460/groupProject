package AAObjectClassPractice;

public class FacebookUser {
    String username;
    String password;
    String name;
    int age;
    int numberOfFriends;

    public FacebookUser(String username,String password) {
        this.username = username;

        if (password.contains(username)) {
            System.out.println("Invalid password");
            this.password = "password";
        } else {
            this.password = password;
        }
    }
        public FacebookUser(String username,String password,String name){
        this(username,password);

        name = name.replace(" ","");
        boolean valid = true;

        for(int i =0;i<name.length(); i++){
            if(!Character.isLetter(name.charAt(i))){
               valid = false;
               break;
            }
        }
        if(valid){
            this.name = name;
        }else{
            System.out.println("Invalid name");
            this.name = "no name";
        }
    }
    public FacebookUser(String username,String password,String name,
                        int age,int numberOfFriends) {
        this(username, password, name);
        if (age < 0) {
            System.out.println("Invalid age");
        } else {
            this.age = age;
        }
        if (numberOfFriends < 0 || numberOfFriends > 5000) {
            System.out.println("Invalid number of friends");
        } else {
            this.numberOfFriends = numberOfFriends;
        }
    }
        public void info(){
            System.out.println("Name: " + name);
            System.out.println("username: " + username);
            System.out.println("age: " + age);
            System.out.println("Number of friends: " + numberOfFriends);


    }

       public boolean sendFriendRequest(FacebookUser userTwo) {
           if (this.numberOfFriends >= 5000) {
               System.out.println("You reached your limit");
               return false;

           } else if (userTwo.numberOfFriends >= 5000) {
               System.out.println(userTwo.name + "  has reach the limit of friends");
               return false;
           } else {
               System.out.println("Friend request sent");
               this.numberOfFriends++;
               userTwo.numberOfFriends++;
               return true;
           }


       }   }