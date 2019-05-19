package ch09_interface;
/*
 * 接口一定是抽象的，接口可以继承多个接口
 */
interface Flyer1{}
interface Jet1{}
interface JetFlyer1 extends Flyer1,Jet1{}

public class Use_interface {

}
