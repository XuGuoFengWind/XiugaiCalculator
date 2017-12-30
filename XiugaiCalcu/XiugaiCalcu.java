import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class JCalcu extends JFrame implements ActionListener{
	JFrame JF;
	JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9,jb10,jb11,jb12,jb13,jb14,
	jb15,jb16,jb17,jb18,jb19,jb20;
	JTextField jt;
	JPanel jp1,jp2,jp3,jp4,jp5,jp6;
	boolean first=true;
	double storeresult=0.0;
	String operator="=";
	boolean operate_able=true;  //判断操作是否合法
	
	public JCalcu(){
		JF=new JFrame();
		JF.setLayout(null);
		
		jb1=new JButton("1");jb1.setFont(new Font("微软雅黑",Font.PLAIN,16));
		jb1.addActionListener(this);
		jb2=new JButton("2");jb2.setFont(new Font("微软雅黑",Font.PLAIN,16));
		jb2.addActionListener(this);
		jb3=new JButton("3");jb3.setFont(new Font("微软雅黑",Font.PLAIN,16));
		jb3.addActionListener(this);
		jb4=new JButton("4");jb4.setFont(new Font("微软雅黑",Font.PLAIN,16));
		jb4.addActionListener(this);
		jb5=new JButton("5");jb5.setFont(new Font("微软雅黑",Font.PLAIN,16));
		jb5.addActionListener(this);
		jb6=new JButton("6");jb6.setFont(new Font("微软雅黑",Font.PLAIN,16));
		jb6.addActionListener(this);
		jb7=new JButton("7");jb7.setFont(new Font("微软雅黑",Font.PLAIN,16));
		jb7.addActionListener(this);
		jb8=new JButton("8");jb8.setFont(new Font("微软雅黑",Font.PLAIN,16));
		jb8.addActionListener(this);
		jb9=new JButton("9");jb9.setFont(new Font("微软雅黑",Font.PLAIN,16));
		jb9.addActionListener(this);
		jb10=new JButton("0");jb10.setFont(new Font("微软雅黑",Font.PLAIN,16));
		jb10.addActionListener(this);
		jb11=new JButton("+");jb11.setFont(new Font("微软雅黑",Font.PLAIN,16));
		jb11.addActionListener(this);jb11.setForeground(Color.red);jb11.setBackground(Color.YELLOW);
		jb12=new JButton("-");jb12.setFont(new Font("微软雅黑",Font.PLAIN,16));
		jb12.addActionListener(this);jb12.setForeground(Color.red);jb12.setBackground(Color.YELLOW);
		jb13=new JButton("*");jb13.setFont(new Font("微软雅黑",Font.PLAIN,16));
		jb13.addActionListener(this);jb13.setForeground(Color.red);jb13.setBackground(Color.YELLOW);
		jb14=new JButton("/");jb14.setFont(new Font("微软雅黑",Font.PLAIN,16));
		jb14.addActionListener(this);jb14.setForeground(Color.red);jb14.setBackground(Color.YELLOW);
		jb15=new JButton(".");jb15.setFont(new Font("微软雅黑",Font.PLAIN,16));
		jb15.addActionListener(this);jb15.setForeground(Color.red);jb15.setBackground(Color.YELLOW);
		jb16=new JButton("+/-");jb16.setFont(new Font("微软雅黑",Font.PLAIN,14));
		jb16.addActionListener(this);jb16.setForeground(Color.red);jb16.setBackground(Color.YELLOW);
		jb17=new JButton("CE");jb17.setFont(new Font("微软雅黑",Font.PLAIN,14));
		jb17.addActionListener(this);jb17.setForeground(Color.red);jb17.setBackground(Color.YELLOW);
		jb18=new JButton("%");jb18.setFont(new Font("微软雅黑",Font.PLAIN,16));
		jb18.addActionListener(this);jb18.setForeground(Color.red);jb18.setBackground(Color.YELLOW);
		jb19=new JButton("=");jb19.setFont(new Font("微软雅黑",Font.PLAIN,16));
		jb19.addActionListener(this);jb19.setForeground(Color.red);jb19.setBackground(Color.YELLOW);
		jb20=new JButton("sqrt");jb20.setFont(new Font("微软雅黑",Font.PLAIN,12));
		jb20.addActionListener(this);jb20.setForeground(Color.red);jb20.setBackground(Color.YELLOW);
		
		jt=new JTextField();
		jt.setEditable(false);
		jt.setHorizontalAlignment(JTextField.RIGHT); //设置从右边开始显示文字
		JF.getContentPane().add(jt);jt.setBounds(10, 10, 240, 40);
		
		JF.getContentPane().add(jb17);jb17.setBounds(10,50,60,40);
		JF.getContentPane().add(jb14);jb14.setBounds(70,50,60,40);
		JF.getContentPane().add(jb13);jb13.setBounds(130,50,60,40);
		JF.getContentPane().add(jb20);jb20.setBounds(190,50,60,40);
		
		JF.getContentPane().add(jb7);jb7.setBounds(10,90,60,40);
		JF.getContentPane().add(jb8);jb8.setBounds(70,90,60,40);
		JF.getContentPane().add(jb9);jb9.setBounds(130,90,60,40);
		JF.getContentPane().add(jb12);jb12.setBounds(190,90,60,40);
		
		JF.getContentPane().add(jb4);jb4.setBounds(10,130,60,40);
		JF.getContentPane().add(jb5);jb5.setBounds(70,130,60,40);
		JF.getContentPane().add(jb6);jb6.setBounds(130,130,60,40);
		JF.getContentPane().add(jb11);jb11.setBounds(190,130,60,40);
		
		JF.getContentPane().add(jb1);jb1.setBounds(10,170,60,40);
		JF.getContentPane().add(jb2);jb2.setBounds(70,170,60,40);
		JF.getContentPane().add(jb3);jb3.setBounds(130,170,60,40);
		JF.getContentPane().add(jb16);jb16.setBounds(190,170,60,40);
		
		JF.getContentPane().add(jb18);jb18.setBounds(10,210,60,40);
		JF.getContentPane().add(jb10);jb10.setBounds(70,210,60,40);
		JF.getContentPane().add(jb15);jb15.setBounds(130,210,60,40);
		JF.getContentPane().add(jb19);jb19.setBounds(190,210,60,40);
		
		JF.setTitle("计算器");
		JF.setSize(270,300);
		JF.setLocation(300,300);
		JF.setResizable(true);
		JF.setVisible(true);
		//JF.pack();
		JF.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String label=e.getActionCommand();
		if(label.equals(jb17))
		{
			jt.setText("0");
		}
		else if("0123456789.".indexOf(label)>=0)
		{
			Number(label);   //处理数字
		}else {
			Operator(label);  //处理运算符号
		}
	}
	
	
	public void Number(String key){
		if(first) {
			//输入第一个数字
			jt.setText(key);
		}else if((key.equals(".")) && (jt.getText().indexOf(".")<0)) {
			//输入的是小数点，并且前面没有小数点
			jt.setText(jt.getText()+".");
		}else if(!key.equals(".")) {
			//输入的不是小数点
			jt.setText(jt.getText()+key);
		}
		first=false;
	}
	
	public void Operator(String key) {
		if(operator.equals("/")) {
			if(getNumber()==0.0) {
				//操作不合法
				operate_able=false;
				jt.setText("除数不能为0");
			}else {
				storeresult/=getNumber();
			}
		}
		else if(operator.equals("+")) {
			storeresult+=getNumber();
		}
		else if(operator.equals("-")) {
			storeresult-=getNumber();
		}
		else if(operator.equals("*"))
		{
			storeresult*=getNumber();
		}
		else if(operator.equals("sqrt"))
		{
			storeresult=Math.sqrt(storeresult);
		}
		else if(operator.equals("%"))
		{
			storeresult=storeresult/100;
		}
		else if(operator.equals("+/-"))
		{
			storeresult=storeresult*(-1);
		}
		else if(operator.equals("=")) 
		{
			storeresult=getNumber();
		}
		if(operate_able) {
			long x1;
			double x2;
			x1=(long)storeresult;
			x2=storeresult-x1;
			if(x2==0) {
				jt.setText(String.valueOf(x1));
				}
		}else {
			jt.setText(String.valueOf(storeresult));
		}
		
		operator=key;
		first=true;
		operate_able=true;
	}
	
	
	public double getNumber() {
		double result=0;
		try {
			result=Double.valueOf(jt.getText()).doubleValue();
		}catch(Exception e) {
			System.out.println("数字格式转换错误");
		}
		return result;
	}
	
	public static void main(String[] args) {
		JCalcu ab=new JCalcu();
	}
}