import java.util.Scanner;

public class View {
    private Scanner scanner = new Scanner(System.in);
    private Controller employeeController = new Controller();

    public void generateMenu() {
        try {
            while (true) {
                System.out.println("-----------------Quản lý toài khoản ----------------");
                System.out.println("1. Đăng ký tài khoản.");
                System.out.println("2. Đăng nhập.");
                System.out.println("3. Thoát.");
                System.out.print("Chọn: ");
                int chọn = scanner.nextInt();
                scanner.nextLine();
                switch (chọn) {
                    case 1:
                        employeeController.create();
                        break;
                    case 2:
                        Employess employee = employeeController.logIn();
                        printDetail(employee);
                        break;
                    case 3:
                        System.out.println("Goodbye");
                        return;
                    default:
                        System.out.println("Mục bạn nhập không có yêu cầu nhâp lại");
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void printDetail(Employess emp) {
        if (emp == null) {
            System.out.println("  Tài khoản hoặc mật khẩu bạn nhập không đúng");

        } else {
            System.out.println("    Tên                          |   " + emp.getName());
            System.out.println("    Địa chỉ                      |   " + emp.getAddress());
            System.out.println("    Email                        |   " + emp.getEmail());
            System.out.println("    Tài khoản                    |   " + emp.getAccount());
            System.out.println("    Mật khẩu                     |   " + emp.getPassword());
            System.out.println("    Ngày tạo                     |   " + emp.getDateCreated());
            System.out.println("    Ngày cập nhật                |   " + emp.getUpdateDay());
            System.out.println("    Trạng thái                   |   " + (emp.getStatus() == 0 ? "Chưa kích hoạt" : "Đã kích hoạt"));

        }
    }

}
