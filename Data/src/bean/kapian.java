package bean;

public class kapian {
	
	//ͷ��·��
	public String imgurl;
	
	public String getImgurl() {
		return imgurl;
	}

	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getRevenue() {
		return revenue;
	}

	public void setRevenue(String revenue) {
		this.revenue = revenue;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	//����
	public String name;
	
	//���
	public String money;
	
	//���׷��
	public String style;
	
	//��������
	public String num;
	
	
	//������
	public String revenue;
	
	//���
	public String id;
	
	public kapian(String imgurl,String name,String money,String style,String num,String revenue,String id){
		
		this.imgurl=imgurl;
		this.name=name;
		this.money=money;
		this.style=style;
		this.num=num;
		this.revenue=revenue;
		this.id=id;
	}
	
}
