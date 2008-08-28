class Message {

    static belongsTo = User
    
    User user;
    String text;
    Date createdOn = new Date();
}
