
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class EmployessModel {
    public boolean register(Employess emp) {
        try {
            String cmd = "insert into employees(name,address,email,account,password,dateCreated,updateDay,status) values (?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = Connection.getConnection().prepareStatement(cmd);
            preparedStatement.setString(1, emp.getName());
            preparedStatement.setString(2, emp.getAddress());
            preparedStatement.setString(3, emp.getEmail());
            preparedStatement.setString(4, emp.getAccount());
            preparedStatement.setString(5, emp.getPassword());
            preparedStatement.setString(6,  emp.getDateCreated());
            preparedStatement.setString(7,  emp.getUpdateDay());
            preparedStatement.setInt(8, emp.getStatus());
            preparedStatement.execute();
            System.out.println("Tạo tài khoản thành công!!");
            return true;
        } catch (SQLException throwables) {
            System.out.println("Không thể tạo tài khoản: " + throwables.getMessage());
            return false;
        }
    }

    public boolean checkExistAccount(String account) {
        try {
            String cmd = "SELECT account FROM employees WHERE account = ?";
            PreparedStatement preparedStatement = Connection.getConnection().prepareStatement(cmd);
            preparedStatement.setString(1, account);
            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println("--------------------------------------------------------------------------------");
            while (resultSet.next()) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("Lỗi!");
        }
        return false;
    }

    public Employess login(String account, String password) {
        try {
            String cmd = "select * from employees where account = ? and password = ?";
            PreparedStatement preparedStatement = Connection.getConnection().prepareStatement(cmd);
            preparedStatement.setString(1, account);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                String Name = resultSet.getString(1);
                String Address = resultSet.getString(2);
                String Email = resultSet.getString(3);
                String Account = resultSet.getString(4);
                String Password = resultSet.getString(5);
                String CreatedDate = resultSet.getString(6);
                String UpdateDay = resultSet.getString(7);
                Integer Status = resultSet.getInt(8);
                Employess employee = new Employess(Name, Address, Email, Account, Password, CreatedDate, UpdateDay, Status);
                System.out.println("Đăng nhập thành công!");
                return employee;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

}

