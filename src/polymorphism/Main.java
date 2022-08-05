package polymorphism;

import ReCapDemo_Classes.DortIslem;

public class Main {
    public static void main(String[] args) {
//        EmailLogger Logger = new EmailLogger();
//        Logger.log("Log mesajı");
/*
        BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new EmailLogger(), new DatabaseLogger()};
        for(BaseLogger logger:loggers){
            logger.log("Log mesajı");
        }
*/

        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.add();
    }
}
