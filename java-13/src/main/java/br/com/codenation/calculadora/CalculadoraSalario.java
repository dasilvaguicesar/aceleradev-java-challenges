package br.com.codenation.calculadora;

public class CalculadoraSalario {

	public long calcularSalarioLiquido(double salarioBase) {
		double grossSalaryLessInss = calculateInss(salarioBase);
		double grossSalaryLessInssAndIrrf = calculateIrrf(grossSalaryLessInss);
		return Math.round(grossSalaryLessInssAndIrrf);
	}

	private double calculateInss(double baseSalary) {
		double netSalary;
		double minimumWage = 1039.0;
		double salaryRange1 = 1500.0;
		double salaryRange2 = 4000.0;
		double pecentualInssRange1 = 8.0 / 100;
		double pecentualInssRange2 = 9.0 / 100;
		double pecentualInssRange3 = 11.0 / 100;

		if (baseSalary < minimumWage){
			return 0;
		} else if(baseSalary > minimumWage && baseSalary <= salaryRange1){
			netSalary = baseSalary - (baseSalary * pecentualInssRange1);
			return  netSalary;
		} else if (baseSalary > salaryRange1 && baseSalary <= salaryRange2){
			netSalary = baseSalary - (baseSalary * pecentualInssRange2);
			return  netSalary;
		} else {
			netSalary = baseSalary - (baseSalary * pecentualInssRange3);
			return netSalary;
		}

	}

	private double calculateIrrf(double grossSalaryLessInss) {
		double irrfFreeSalary = 3000.0;
		double pecentualIrrfRange1 = 7.5 / 100;
		double pecentualIrrfRange2 = 15.0 / 100;
		double salaryRange = 6000.0;
		double grossSalaryLessInnsAndIrrf;

		if(grossSalaryLessInss <= irrfFreeSalary){
			return grossSalaryLessInss;
		} else if(grossSalaryLessInss > irrfFreeSalary && grossSalaryLessInss <= salaryRange){
			grossSalaryLessInnsAndIrrf = grossSalaryLessInss - (grossSalaryLessInss * pecentualIrrfRange1);
			return grossSalaryLessInnsAndIrrf;
		} else {
			grossSalaryLessInnsAndIrrf = grossSalaryLessInss - (grossSalaryLessInss * pecentualIrrfRange2);
			return grossSalaryLessInnsAndIrrf;
		}

	}

}
