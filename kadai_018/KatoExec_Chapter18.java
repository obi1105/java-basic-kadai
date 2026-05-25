package kadai_018;

abstract public class KatoExec_Chapter18 extends Kato_Chapter18{

	public static void main(String[] args) {
		
		KatoTaro_Chapter18 taro = new KatoTaro_Chapter18();
		KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18();
		KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();
		
		taro.givenName = "太郎";
		ichiro.givenName = "一郎";
		hanako.givenName = "花子";
		
		taro.execIntroduce();
		ichiro.execIntroduce();
		hanako.execIntroduce();
		}
}
