
public class Hibernateorder
{
	int order_id,qty;
	String cust_name,addr,ph_no,order_date;
	public Hibernateorder() {
		super();
	}
	public Hibernateorder(int order_id, int qty, String cust_name, String addr, String ph_no, String order_date) {
		super();
		this.order_id = order_id;
		this.qty = qty;
		this.cust_name = cust_name;
		this.addr = addr;
		this.ph_no = ph_no;
		this.order_date = order_date;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getPh_no() {
		return ph_no;
	}
	public void setPh_no(String ph_no) {
		this.ph_no = ph_no;
	}
	public String getOrder_date() {
		return order_date;
	}
	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	} 
	

}
