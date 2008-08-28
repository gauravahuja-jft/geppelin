class User {

  static hasMany = [messages:Message]

  UserGroup group;

  String login;
  String password;
  
}
