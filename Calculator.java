/**
    Класс реализует калькулятор
*/
public class Calculator {
   /**
       Результат вычисления.
   */
	private int result;
	/**
		Суммирует аргументы.
		@param params Аргументы суммирования.
	*/
public void add(int ... params) {
	for (Integer param : params) {
		this.result += param;
		}
	}
		/**
			Получить Результат.
			@return результат вычисления.
		*/
		public int getResult() {
			return this.result;
		}
		/**
		Очистить Результат вычисления
		*/
		public void cleanResult(){
			this.result = 0;
		}
}