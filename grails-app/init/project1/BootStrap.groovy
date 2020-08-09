package project1

class BootStrap {

    def init = { servletContext ->
        User user1= new User(username: 'user',password: '123',accountExpired: false,accountLocked: false,passwordExpired:false).save()
        Role role=new Role(authority:'Admin').save()
        UserRole userRole= new UserRole(user: user1,role: role).save()

    }
    def destroy = {
    }
}
