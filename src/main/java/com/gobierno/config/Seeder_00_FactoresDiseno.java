package com.gobierno.config;

import com.gobierno.model.FactorDiseno;
import com.gobierno.repository.FactorDisenoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Order(0) // Se ejecuta antes que los dominios EDM, APO, etc.
public class Seeder_00_FactoresDiseno implements CommandLineRunner {

    private final FactorDisenoRepository factorRepository;

    public Seeder_00_FactoresDiseno(FactorDisenoRepository factorRepository) {
        this.factorRepository = factorRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (factorRepository.count() == 0) {
            System.out.println("Iniciando carga de datos: 11 Factores de Diseño (Toyota OTA)...");
            cargarFactores();
            System.out.println("Factores de Diseño cargados exitosamente.");
        }
    }

    private void cargarFactores() {
        FactorDiseno df01 = new FactorDiseno();
        df01.setIdFactor("DF01");
        df01.setNombreFactor("Estrategia Empresarial");
        df01.setDescripcionGeneral("La dirección estratégica que toma la empresa para posicionarse en el mercado.");
        df01.setDimensionSeleccionada("Innovación / Diferenciación");
        df01.setImpactoProyectoOTA("Toyota busca diferenciarse pasando de ser un fabricante tradicional a una empresa de movilidad basada en software (Arene OS), priorizando la innovación disruptiva sobre el liderazgo en costos.");

        FactorDiseno df02 = new FactorDiseno();
        df02.setIdFactor("DF02");
        df02.setNombreFactor("Metas Empresariales");
        df02.setDescripcionGeneral("Los objetivos primordiales que la empresa espera alcanzar soportados por TI.");
        df02.setDimensionSeleccionada("Portafolio competitivo (EG01) y Continuidad (EG06)");
        df02.setImpactoProyectoOTA("Exige que la arquitectura de AWS garantice alta disponibilidad (99.99%) para asegurar que ninguna actualización OTA interrumpa el funcionamiento mecánico del vehículo.");

        FactorDiseno df03 = new FactorDiseno();
        df03.setIdFactor("DF03");
        df03.setNombreFactor("Perfil de Riesgo");
        df03.setDescripcionGeneral("Tipos de riesgo a los que la empresa está expuesta actualmente.");
        df03.setDimensionSeleccionada("Riesgo Cibernético y Operativo (Alto)");
        df03.setImpactoProyectoOTA("Un ataque cibernético a la red OTA no solo roba datos, sino que pone en peligro la vida de los conductores. Esto eleva los niveles de capacidad requeridos en procesos como EDM03 y APO12.");

        FactorDiseno df04 = new FactorDiseno();
        df04.setIdFactor("DF04");
        df04.setNombreFactor("Problemas Relacionados con I&T");
        df04.setDescripcionGeneral("Puntos de dolor o deficiencias tecnológicas actuales de la empresa.");
        df04.setDimensionSeleccionada("Desconexión entre TI y Operaciones Mecánicas");
        df04.setImpactoProyectoOTA("Históricamente, TI solo daba soporte administrativo. El proyecto OTA obliga a fusionar la TI en la nube con la ingeniería mecánica en la planta de ensamblaje.");

        FactorDiseno df05 = new FactorDiseno();
        df05.setIdFactor("DF05");
        df05.setNombreFactor("Panorama de Amenazas");
        df05.setDescripcionGeneral("El entorno en el que opera la empresa respecto a las amenazas de seguridad.");
        df05.setDimensionSeleccionada("Alto (Grupos Cibercriminales)");
        df05.setImpactoProyectoOTA("Los vehículos definidos por software son el nuevo blanco de los hackers. Requiere implementar arquitecturas Zero Trust y cifrado E2EE en toda la transmisión 5G.");

        FactorDiseno df06 = new FactorDiseno();
        df06.setIdFactor("DF06");
        df06.setNombreFactor("Requerimientos de Cumplimiento");
        df06.setDescripcionGeneral("El nivel de regulación externa a la que la empresa debe someterse.");
        df06.setDimensionSeleccionada("Alto / Estricto");
        df06.setImpactoProyectoOTA("Es obligatorio cumplir con la normativa UNECE WP.29 (CSMS) para poder vender y operar vehículos conectados en los mercados internacionales.");

        FactorDiseno df07 = new FactorDiseno();
        df07.setIdFactor("DF07");
        df07.setNombreFactor("Rol de la TI");
        df07.setDescripcionGeneral("Cómo clasifica la empresa la importancia de la tecnología en su negocio.");
        df07.setDimensionSeleccionada("Estratégico");
        df07.setImpactoProyectoOTA("La TI dejó de ser un 'área de soporte'. Con las actualizaciones OTA, la TI es el producto mismo que se entrega al cliente final.");

        FactorDiseno df08 = new FactorDiseno();
        df08.setIdFactor("DF08");
        df08.setNombreFactor("Modelo de Abastecimiento para TI");
        df08.setDescripcionGeneral("Cómo adquiere la empresa sus servicios tecnológicos.");
        df08.setDimensionSeleccionada("Nube Pública (Cloud) / Externalizado");
        df08.setImpactoProyectoOTA("El uso intensivo de AWS para hospedar repositorios de firmware traslada la responsabilidad hacia la gestión de contratos y niveles de servicio (SLAs) con terceros.");

        FactorDiseno df09 = new FactorDiseno();
        df09.setIdFactor("DF09");
        df09.setNombreFactor("Métodos de Implementación de TI");
        df09.setDescripcionGeneral("Metodologías usadas para el desarrollo y despliegue de soluciones.");
        df09.setDimensionSeleccionada("Ágil / DevSecOps");
        df09.setImpactoProyectoOTA("Se abandona el modelo de cascada para pasar a sprints rápidos de despliegue continuo (CI/CD) de software vehicular, integrando seguridad desde el diseño.");

        FactorDiseno df10 = new FactorDiseno();
        df10.setIdFactor("DF10");
        df10.setNombreFactor("Estrategia de Adopción de Tecnología");
        df10.setDescripcionGeneral("La postura de la empresa ante las innovaciones en el mercado.");
        df10.setDimensionSeleccionada("Adoptador Temprano (First Mover)");
        df10.setImpactoProyectoOTA("Toyota busca ser pionero en monetización de características vehiculares mediante suscripciones de software masivas.");

        FactorDiseno df11 = new FactorDiseno();
        df11.setIdFactor("DF11");
        df11.setNombreFactor("Tamaño de la Empresa");
        df11.setDescripcionGeneral("Dimensión de la organización basada en cantidad de empleados e ingresos.");
        df11.setDimensionSeleccionada("Grande (Multinacional)");
        df11.setImpactoProyectoOTA("Exige que el marco de gobierno TI sea altamente formalizado y estandarizado, capaz de abarcar a miles de concesionarios y fábricas a nivel global.");

        factorRepository.saveAll(Arrays.asList(
                df01, df02, df03, df04, df05, df06, df07, df08, df09, df10, df11
        ));
    }
}