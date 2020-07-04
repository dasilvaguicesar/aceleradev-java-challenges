package com.challenge.desafio;

import com.challenge.annotation.Somar;
import com.challenge.annotation.Subtrair;
import com.challenge.interfaces.Calculavel;
import java.lang.reflect.Field;
import java.math.BigDecimal;

public class CalculadorDeClasses implements Calculavel {

  @Override
  public BigDecimal somar(Object obj) {
    BigDecimal total = BigDecimal.ZERO;
    for (Field field : obj.getClass().getDeclaredFields()) {
      field.setAccessible(true);
      try {
        if (field.isAnnotationPresent(Somar.class)){
          total = total.add((BigDecimal) field.get(obj));
        }
      } catch (IllegalAccessException e) {
        e.printStackTrace();
      }
    }
    return total;
  }

  @Override
  public BigDecimal subtrair(Object obj) {
    BigDecimal total = BigDecimal.ZERO;
    for (Field field : obj.getClass().getDeclaredFields()) {
      field.setAccessible(true);
      try {
        if (field.isAnnotationPresent(Subtrair.class)){
          total = total.add((BigDecimal) field.get(obj));
        }
      } catch (IllegalAccessException e) {
        e.printStackTrace();
      }
    }
    return total;
  }

  @Override
  public BigDecimal totalizar(Object obj) {
    return somar(obj).subtract(subtrair(obj));
  }
}
