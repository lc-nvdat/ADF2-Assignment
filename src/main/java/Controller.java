import java.util.Scanner;

public class Controller {
    private Scanner scanner = new Scanner(System.in);
    private EmployessModel employeeModel = new EmployessModel();
    private Employess employee;

    public Employess create() {
        long millis = System.currentTimeMillis();
        java.sql.Date date = new java.sql.Date(millis);
        try {
            System.out.print("Nhập tên: ");
            String name = scanner.nextLine();
            System.out.print("Nhập địa chỉ: ");
            String address = scanner.nextLine();
            System.out.print("Nhập email: ");
            String email = scanner.nextLine();
            System.out.print("Nhập tài khoản: ");
            String account = scanner.nextLine();
            System.out.print("Nhập mật khẩu: ");
            String password = scanner.nextLine();
            System.out.print("Nhập ngày tạo: ");
            String createdDate = scanner.nextLine();
            System.out.print("Nhập cập nhật: ");
            String updateDate = scanner.nextLine();

            System.out.print("Nhập trạng thái( 0: Kích hoạt/ 1: Chưa kích hoạt ): ");
            Integer status = scanner.nextInt();
            scanner.nextLine();
            if (employeeModel.checkExistAccount(account) == false) {
                employee = new Employess(name, address, email, password, password, createdDate, updateDate, status);
                employeeModel.register(employee);
            } else {
                System.err.println("Tài khoản đã tồn tại");
            }
        } catch (Exception e) {
            System.err.println("Lỗi: " + e.getMessage());
        }
        return null;
    }

    public Employess logIn() {
        employee = new Employess();
        System.out.println("Nhập mật khẩu và tài khoản ");
        System.out.print("Nhập tài khoản: ");
        employee.setAccount(scanner.nextLine());
        System.out.print("Nhập mật khẩu: ");
        employee.setPassword(scanner.nextLine());
        Employess emp = employeeModel.login(employee.getAccount(), employee.getPassword());
        return emp;
    }

}
