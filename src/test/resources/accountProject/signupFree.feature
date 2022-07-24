Feature: Signup

  @Regression
  Scenario: crear cuenta con usuario y password aleatorios

    Given la pagina "http://todo.ly/" este abierta
    And quiero crear una nueva cuenta
      | fullName    | email                   | password |
      | JavierSilva | javiersilva@outlook.com | ppp      |
    Then debo ingresar a la app web