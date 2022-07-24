package day08;
import java.util.Scanner;
public class dish {
    public static void main(String[] args) {
        String  names[]= new String[4];//姓名
        String  dishmes[]= new String[4];//餐品名称
        String  addresses[]= new String[4];//地址
        int times[]=new int[4];//送餐时间
        int states[] = new int[4];//订餐状态
        double sumprices[] = new double[4];
        String dish[] = new String[3];//菜单
        dish[0]="汉堡王";
        dish[1]="华莱士";
        dish[2]="啃得起";
        Double price[]=new Double[3];//菜品价格
        price[0]=48.0;
        price[1]=38.0;
        price[2]=28.0;
        int zan[] = new int[4];//点赞数
        zan[0]=0;
        zan[1]=0;
        zan[2]=0;
        //默认的两个订单
        names[0]="张三";
        dishmes[0]="鱼香肉丝";
        times[0]=12;
        addresses[0]="半圆学社";
        states[0]=0;
        sumprices[0]=13;
        names[1]="李四";
        dishmes[1]="杭椒炒肉";
        times[1]=11;
        addresses[1]="钟山金典";
        states[1]=0;
        sumprices[1]=15;
        Scanner sc = new Scanner(System.in);
        System.out.println("欢迎使用吃货联盟订餐系统");
        int m=-1;
        do {
            System.out.println("**********************************************");
            System.out.println("1.我要订餐");
            System.out.println("2.查看餐袋");
            System.out.println("3.签收订单");
            System.out.println("4.删除订单");
            System.out.println("5.我要点赞");
            System.out.println("6.退出系统");
            System.out.println("**********************************************");
            System.out.print("请选择：");
            int choice = sc.nextInt();
            boolean isAdd=false;//表示是否可以添加订单（数组满没满），false表示不可添加，true表示可以添加
            boolean idFind = false;//表示是否能够查询到，true可以，false不可以
            boolean isDel= false;//表示能否删除
            boolean isExit=false;//表示是否退出，false不退出，true退出
            switch (choice){
                //订餐系统
                case 1:
                    System.out.println("***我要订餐***");
                    //遍历姓名数组
                    for (int i = 0; i < names.length ; i++) {
                        //查找空元素
                        if (names[i] == null) {
                            isAdd = true;//将其设置为真
                            System.out.println("请输入订餐人姓名：");
                            String name1 = sc.next();
                            System.out.println("序号\t菜名\t单价\t点赞数");
                            for (int j = 0; j < dish.length; j++) {
                                System.out.println((j + 1) + dish[j] + price[j] +"\t"+ zan[j]);
                            }
                            System.out.println("请选择你要点的菜品编号：");
                            int num = sc.nextInt();
                            String dish1 = dish[num - 1];//将菜单数组中第num-1个元素的值赋给dish1，
                            System.out.println("请输入您需要的份数");
                            int fen = sc.nextInt();
                            //计算餐费和送餐费（3元运算符）
                            double pri = fen * price[num - 1];
                            double p = pri > 50 ? 0 : 5;
                            //用户输入送餐时间，如果提前或者超出则提示重新输入
                            System.out.println("请选择送餐时间：（10点~20点）");
                            int time = sc.nextInt();
                            while (time > 20 || time < 8) {
                                System.out.println("不在送餐时间，请重新输入");
                                time = sc.nextInt();
                            }
                            //
                            System.out.println("请输入地址");
                            String address = sc.next();
                            System.out.println("订餐成功！");
                            System.out.println("您订的是：" + dish1 + fen + "份");
                            System.out.println("送餐时间：" + time + "点");
                            System.out.println("餐费" + pri + "送餐费" + p + "总计" + (pri + p) + "元");
                            //将输入的值存入相应数组
                            names[i] = name1;
                            dishmes[i] = dish1;
                            times[i] = time;
                            states[i] = 1;
                            addresses[i] = address;
                            sumprices[i] = pri + p;
                            break;
                        }
                    }
                    //如果数组已满，提示用户餐袋满了
                    if (!isAdd){
                        System.out.println("对不起，餐袋满了");
                    }
                    break;
                case 2:
                    System.out.println("***查看餐袋***");
                    System.out.println("序号\t"+"订餐人\t"+"餐品信息\t"+"送餐日期\t"+"送餐地址\t"+"\t"+"总金额\t"+"订单状态\t");
                    for (int i = 0; i < 4; i++) {
                        if (names[i]!=null){
                            String time1 =times[i]+"时";
                            String price1 = sumprices[i]+"元";
                            String statu = states[i]==0?"已完成":"已预订";
                            System.out.println((i+1)+"\t"+"\t"+names[i]+"\t"+"\t"+dishmes[i]+"\t"+time1+"\t"+addresses[i]+"\t"+"\t"+price1+"\t"+statu);
                        }
                    }
                    break;
                case 3:
                    System.out.println("请选择要签收的订单序号：");
                    int xu = sc.nextInt();
                    for (int i = 0; i < names.length; i++) {
                        //查找姓名不为空，处于预定状态的，与输入序号对应的订单
                        if (names[i]!=null && states[i]==1 && xu==i+1){
                            idFind=true;
                            states[i]=0;
                            System.out.println("订单签收成功");
                        }else if (names[i]!=null && states[i]==0 && xu==i+1){
                            idFind=true;
                            System.out.println("无法重复签收");
                        }
                    }
                    if (!idFind){
                        System.out.println("订单号输入错误！");
                    }
                    break;
                case 4:
                    System.out.println("***删除订单***");
                    System.out.println("请输入要删除的序号");
                    int del = sc.nextInt();
                    /*
                    1.遍历数组
                    2.判断是否完成
                    3。将后面的值向前挪动
                    4。将最后一个元素置空
                     */
                    for (int i = 0; i < names.length; i++) {
                        if ( names[i]!=null && states[i]==0 && del ==i+1){
                            isDel =true;
                            for (int j = i; j < names.length-1 ; j++) {
                                names[j]=names[j+1];
                                dishmes[j]=dishmes[j+1];
                                sumprices[j]=sumprices[j+1];
                                addresses[j]=addresses[j+1];
                                times[j]=times[j+1];
                                states[j]=states[j+1];
                            }
                            System.out.println("订单已删除");
                            names[names.length-1]=null;
                            dishmes[dishmes.length-1]=null;
                            sumprices[sumprices.length-1]=0;
                            addresses[addresses.length-1]=null;
                            times[times.length-1]=0;
                            states[states.length-1]=0;
                            break;
                        }else if (names[i]!=null && states[i]==1 && del ==i+1){
                            isDel=true;
                            System.out.println("您选择的订单还未完成，不能删除");
                            break;
                        }
                    }
                    if (!isDel){
                        System.out.println("你要删除的订单不存在");
                    }
                    break;
                case 5:
                    //我要点赞
                    System.out.println("***我要点赞***");
                    System.out.println("序号\t菜名\t单价\t点赞数");
                    for (int j = 0; j < dish.length; j++) {
                        System.out.println((j + 1) + dish[j] + price[j] + zan[j]);
                    }
                    System.out.println("请选择你要点赞的菜品序号");
                    int dianzan= sc.nextInt();
                    zan[dianzan-1]++;
                    System.out.println("点赞成功");
                    break;
                case 6:
                    System.out.println("***退出系统***");
                    isExit =true;
                    break;
                default:
                    isExit=true;
                    System.out.println("结束点餐");
                    break;
            }
            if (!isExit){
                System.out.println("输入0返回上一级");
                m = sc.nextInt();
            }else{
                break;
            }
        }while (m==0);
        System.out.println("谢谢使用");
    }
}
