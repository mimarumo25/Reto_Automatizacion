# Author: Miguel Rubide
Feature: Crear clientes en la aplicacion Siigo
  Como usuario,
  quiero ingresar a la aplicación Siigo,
  para registrar un nuevo cliente a través del formulario de clientes.

  @NuevoCliente
  Scenario Outline: Crear un nuevo cliente desde el formulario de crear clientes en Siigo testing

    Given el usuario inicia sesion en la aplicacion con las siguientes credenciales
      | usuario   | contrasena   |
      | <usuario> | <contrasena> |
    And el usuario accede al formulario de creacion de cliente desde el menu
    When el usuario llena el formulario de creacion de cliente con los siguientes datos:
      | tipo   | tipo_identificacion   | identificacion   | codigo_sucursal   | nombres   | apellidos   | nombre_comercial   | ciudad   | direccion   | telefono   | correo_factura   | nombre_contacto   | correo_contacto   | tipo_regimen_IVA   | responsabilidad_fiscal   | indicativo_factura   | telefono_factura   | codgo_postal_factura   |
      | <tipo> | <tipo_identificacion> | <identificacion> | <codigo_sucursal> | <nombres> | <apellidos> | <nombre_comercial> | <ciudad> | <direccion> | <telefono> | <correo_factura> | <nombre_contacto> | <correo_contacto> | <tipo_regimen_IVA> | <responsabilidad_fiscal> | <indicativo_factura> | <telefono_factura> | <codgo_postal_factura> |
    And el usuario llena los datos de contacto con la siguiente informacion:
      | nombre_contacto   | apellidos_contacto   | correo_contacto   | cargo_contacto   | indicativo_contacto   | telefono_contacto   |
      | <nombre_contacto> | <apellidos_contacto> | <correo_contacto> | <cargo_contacto> | <indicativo_contacto> | <telefono_contacto> |
    Then el sistema deberia mostrar los datos del nuevo cliente en pantalla  "<nombres>" y "<apellidos>"

    Examples:
      | usuario                     | contrasena | tipo       | tipo_identificacion  | identificacion | codigo_sucursal | nombres      | apellidos      | nombre_comercial | ciudad | direccion       | telefono   | correo_factura     | nombre_contacto | correo_contacto      | tipo_regimen_IVA      | responsabilidad_fiscal        | indicativo_factura | telefono_factura | codgo_postal_factura | apellidos_contacto | cargo_contacto | indicativo_contacto | telefono_contacto |
      | admin@siigoautomationqa.com | (#T0Nu@QrO | Es persona | Cédula de ciudadanía | 123456787      | 1233900         | Juan Antonio | Perez Valencia | JAntonioValencia | 05001  | Calle Falsa 123 | 6011234567 | micorreo@gmail.com | Juan Perez      | contacto@ejemplo.com | No responsable de IVA | Régimen simple de tributación | 601                | 6542485          | 5485398              | Perez              | Gerente        | 601                 | 6542485           |
