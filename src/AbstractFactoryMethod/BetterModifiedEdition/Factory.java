package AbstractFactoryMethod.BetterModifiedEdition;

public class Factory {
    private static String reflectPath = "AbstractFactoryMethod.BetterModifiedEdition.";
    private static String database = "Access";//如入果需要修改数据库的类型改动此行代码即可。
    /*如果需要增加数据库Oracle，则需要增加两个个类，OracleDepartment，OracleUser*/
    private static String us = "User";
    private  static String de = "Department";
    public static UserOperator CreateUserOperator() throws ClassNotFoundException {
        UserOperator userOperator = null;
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
