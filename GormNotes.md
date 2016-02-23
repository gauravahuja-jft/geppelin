# Introduction #
General Notes

# Details #
## addXXX has been deprecated ##
After a couple hours of frustration trying to get a parent/child relationship working, I realized the Grails book has deprecated methods.

**Instead of**addXXX**use**addToXXXs

```
def g = new UserGroup(name:'everyone');
g.save();
def g1 = UserGroup.get(1);
def u = new User(login:'daniel',password:'daniel',group:g1)
g1.addToUsers(u);
g1.save();
```