Feature: ChangePasswordAndLogginAgain

  @Regression
  Scenario: Cambiar password con la pagina abierta

    Given la pagina "http://todo.ly/" este abierta
    When quiero realizar el login
      | email    | javiersilvasierra@outlook.com|
      | password | bordetella                 |
    Then debo ingresar a la app web
    And quiero ir a settings y cambiar el password
      | old password | bordetella|
      | new password | 321xxx---|
    And quiero cerrar sesion y volver a iniciar sesion con el nuevo password
      | email    | javiersilvasierra@outlook.com |
      | password | 321xxx---                 |
    Then tendria que lograr ingresar a la app web con las nuevas credenciales
