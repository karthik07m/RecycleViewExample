export class Employee {
    empId: number;
    empName: String;
    empEmail: String;
    empMobileNo: number;
    empDoj: String;
    empDept: String;
    empLeaveBalance: number;
    empManagerId: number;
    constructor(id: number) {
      this.empId = id;
    }
}
