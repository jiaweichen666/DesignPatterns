package AbstractFactoryMethod.BsetModifiedEdition;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Factory {
    private static String reflectPath = "AbstractFactoryMethod.BsetModifiedEdition.";//这里应该是best拼写错误
    private static String database;//如入果需要修改数据库的类型,则改动配置文件中的database字段即可，使用配置文件进一步强化了开闭原则
    /*如果需要增加数据库Oracle，则需要增加两个个类，OracleDepartment，OracleUser*/
    private static String us = "User";
    private  static String de = "Department";
    public static String getChosenDatabase(){
    Properties properties  = new Properties();
    String databaseName = "";
       try {
    InputStream inputStream = new BufferedInputStream(new FileInputStream("E:\\hadoop\\hadoop-workspace\\DesingnPatterns\\src\\AbstractFactoryMethod\\BsetModifiedEdition\\DatabaseChosenFile.properties"));
    properties.load(inputStream);
    databaseName = properties.getProperty("database");
           //System.out.println(databaseName);
       }catch (Exception e){
           e.printStackTrace();
       }
       return databaseName;
    }
    public static UserOperator CreateUserOperator() throws ClassNotFoundException {
        UserOperator userOperator = null;
        database = getChosenDatabase();
        String classPath = reflectPath+database+us;
        try {
            userOperator =(UserOperator) Class.forName(classPath).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return userOperator;
    }
    public static DepartmentOperator CreateDepartmentOperator() throws CloneNotSupportedException {
        DepartmentOperator departmentOperator = null;
        database = getChosenDatabase();
        String classPath = reflectPath+database+de;
        try {
            departmentOperator =(DepartmentOperator) Class.forName(classPath).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return departmentOperator;
    }
}
