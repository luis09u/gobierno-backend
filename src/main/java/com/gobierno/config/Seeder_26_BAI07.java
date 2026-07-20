package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Order(25) // Secuencia en el dominio BAI
public class Seeder_26_BAI07 implements CommandLineRunner {

    private final ProcesoCobitRepository procesoRepository;

    public Seeder_26_BAI07(ProcesoCobitRepository procesoRepository) {
        this.procesoRepository = procesoRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (!procesoRepository.existsById("BAI07")) {
            System.out.println("Iniciando carga de datos oficiales: BAI07...");
            cargarBAI07();
            System.out.println("BAI07 (Gestionar la aceptación y transición de los cambios de TI) cargado exitosamente.");
        }
    }

    private void cargarBAI07() {
        // ==========================================
        // INFORMACIÓN GENERAL (COBIT 2019 OFICIAL)
        // ==========================================
        ProcesoCobit bai07 = new ProcesoCobit();
        bai07.setIdProceso("BAI07");
        bai07.setDominio("Construir, Adquirir e Implementar");
        bai07.setAreaPrioritaria("Modelo Core de COBIT");
        bai07.setNombreProceso("Gestionar la aceptación y transición de los cambios de TI");
        bai07.setDescripcionProceso("Aceptar formalmente y hacer operativas las nuevas soluciones. Incluir la planificación, conversión, pruebas de aceptación, comunicación, preparación de puesta en producción y revisión posterior a la implementación.");
        bai07.setPropositoProceso("Implementar soluciones de forma segura y conforme a las expectativas y resultados acordados, asegurando que las actualizaciones de firmware (OTA) se integren en la flota sin disrupciones operativas ni riesgos mecánicos.");

        bai07.setMetasAlineamiento("AG06: Agilidad para convertir los requisitos del negocio en soluciones operativas.");
        bai07.setMetasEmpresariales("EG01: Portafolio de productos y servicios competitivos.");
        bai07.setMetricasModelo("Métrica 1: Nivel de satisfacción de los ejecutivos del negocio con la capacidad de respuesta a los nuevos requisitos automotrices (AG06).\nMétrica 2: Porcentaje de soluciones OTA implementadas que proporcionan una ventaja competitiva de mercado (EG01).");

        // ==========================================
        // COMPONENTE A: PRÁCTICAS Y ACTIVIDADES (Enfoque OTA)
        // ==========================================
        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(bai07);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        // Práctica 1
        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("BAI07.01");
        pract01.setNombrePractica("Establecer un plan de implementación");
        pract01.setDescripcionPractica("Establecer un plan de implementación que cubra criterios de pruebas, preparación para el despliegue OTA, y plan de contingencia (fallback/rollback).");
        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Crear un plan de implementación detallando la secuencia de despliegue a los vehículos, criterios de aceptación y estrategia de rollback automático."); a1_1.setNivelCapacidadEsperado(2); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Identificar y documentar formalmente los procesos de recuperación en caso de interrupción en la descarga del software en la ECU."); a1_2.setNivelCapacidadEsperado(3); a1_2.setCalificacionActual("N");
        Actividad a1_3 = new Actividad(); a1_3.setPractica(pract01); a1_3.setDescripcionActividad("Revisar formalmente el riesgo técnico y mecánico asociado con la actualización, asegurando la aprobación por parte de auditoría interna y seguridad vial."); a1_3.setNivelCapacidadEsperado(3); a1_3.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2, a1_3));

        // Práctica 2
        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("BAI07.02");
        pract02.setNombrePractica("Planificar la conversión de procesos de negocio, sistemas y datos");
        pract02.setDescripcionPractica("Prepararse para la migración de datos telemáticos e infraestructura, incluyendo pistas de auditoría seguras.");
        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Definir un plan de migración considerando los parámetros operacionales heredados de los vehículos para asegurar la retrocompatibilidad."); a2_1.setNivelCapacidadEsperado(2); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Garantizar que exista un plan de recuperación de datos en la nube que cubra el fallback al procesamiento anterior si la migración de la plataforma falla."); a2_2.setNivelCapacidadEsperado(3); a2_2.setCalificacionActual("N");
        Actividad a2_3 = new Actividad(); a2_3.setPractica(pract02); a2_3.setDescripcionActividad("Considerar el riesgo de continuidad de las telecomunicaciones 5G y los requisitos regulatorios de retención de datos vehiculares."); a2_3.setNivelCapacidadEsperado(3); a2_3.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2, a2_3));

        // Práctica 3
        PracticaCobit pract03 = new PracticaCobit();
        pract03.setComponente(compA);
        pract03.setIdPractica("BAI07.03");
        pract03.setNombrePractica("Plan de pruebas de aceptación");
        pract03.setDescripcionPractica("Establecer un plan que defina roles y criterios de entrada/salida para las pruebas de las plataformas conectadas.");
        Actividad a3_1 = new Actividad(); a3_1.setPractica(pract03); a3_1.setDescripcionActividad("Desarrollar el plan de pruebas garantizando la inclusión de pruebas de estrés, seguridad, privacidad de datos de cabina y preparación operativa."); a3_1.setNivelCapacidadEsperado(3); a3_1.setCalificacionActual("N");
        Actividad a3_2 = new Actividad(); a3_2.setPractica(pract03); a3_2.setDescripcionActividad("Confirmar que el plan aborde la acreditación externa obligatoria de los resultados para cumplir con certificaciones ISO de la industria automotriz."); a3_2.setNivelCapacidadEsperado(3); a3_2.setCalificacionActual("N");
        Actividad a3_3 = new Actividad(); a3_3.setPractica(pract03); a3_3.setDescripcionActividad("Asegurar que el plan establezca criterios innegociables para detener la actualización u ordenar el rollback ante cualquier fallo significativo."); a3_3.setNivelCapacidadEsperado(3); a3_3.setCalificacionActual("N");
        pract03.setActividades(Arrays.asList(a3_1, a3_2, a3_3));

        // Práctica 4
        PracticaCobit pract04 = new PracticaCobit();
        pract04.setComponente(compA);
        pract04.setIdPractica("BAI07.04");
        pract04.setNombrePractica("Establecer un entorno de pruebas");
        pract04.setDescripcionPractica("Definir entornos simulados (Hardware in the loop) que reflejen la realidad operativa de los vehículos en la calle.");
        Actividad a4_1 = new Actividad(); a4_1.setPractica(pract04); a4_1.setDescripcionActividad("Crear una base de datos de pruebas representativa, sanitizando los datos telemáticos reales de los conductores para garantizar su privacidad."); a4_1.setNivelCapacidadEsperado(2); a4_1.setCalificacionActual("N");
        Actividad a4_2 = new Actividad(); a4_2.setPractica(pract04); a4_2.setDescripcionActividad("Asegurar que el entorno de pruebas replique las cargas de red celular (latencia) y la infraestructura de las ECUs reales."); a4_2.setNivelCapacidadEsperado(3); a4_2.setCalificacionActual("N");
        Actividad a4_3 = new Actividad(); a4_3.setPractica(pract04); a4_3.setDescripcionActividad("Garantizar que el entorno de simulación sea criptográficamente seguro e incapaz de interactuar o interferir con la flota comercial de producción."); a4_3.setNivelCapacidadEsperado(3); a4_3.setCalificacionActual("N");
        pract04.setActividades(Arrays.asList(a4_1, a4_2, a4_3));

        // Práctica 5
        PracticaCobit pract05 = new PracticaCobit();
        pract05.setComponente(compA);
        pract05.setIdPractica("BAI07.05");
        pract05.setNombrePractica("Realizar pruebas de aceptación");
        pract05.setDescripcionPractica("Probar los cambios de forma independiente de acuerdo con el plan, asegurando la mitigación de vulnerabilidades de ciberseguridad.");
        Actividad a5_1 = new Actividad(); a5_1.setPractica(pract05); a5_1.setDescripcionActividad("Garantizar que las pruebas de aceptación sean ejecutadas por un grupo independiente del equipo de desarrollo, incluyendo simulaciones de ataque al auto."); a5_1.setNivelCapacidadEsperado(3); a5_1.setCalificacionActual("N");
        Actividad a5_2 = new Actividad(); a5_2.setPractica(pract05); a5_2.setDescripcionActividad("Llevar a cabo pruebas a la seguridad (Penetration Testing) conforme al plan, midiendo debilidades en los límites de acceso a las unidades críticas."); a5_2.setNivelCapacidadEsperado(3); a5_2.setCalificacionActual("N");
        Actividad a5_3 = new Actividad(); a5_3.setPractica(pract05); a5_3.setDescripcionActividad("Identificar y registrar los errores como menores o de misión crítica. Promover el código solo con la firma formal de los dueños del riesgo corporativo."); a5_3.setNivelCapacidadEsperado(3); a5_3.setCalificacionActual("N");
        pract05.setActividades(Arrays.asList(a5_1, a5_2, a5_3));

        // Práctica 6
        PracticaCobit pract06 = new PracticaCobit();
        pract06.setComponente(compA);
        pract06.setIdPractica("BAI07.06");
        pract06.setNombrePractica("Promover a producción y gestionar las liberaciones");
        pract06.setDescripcionPractica("Promover la solución mediante despliegues escalonados (Canary Releases), ejecutando rollbacks automáticos si la flota reporta problemas graves.");
        Actividad a6_1 = new Actividad(); a6_1.setPractica(pract06); a6_1.setDescripcionActividad("Determinar hasta qué punto la implementación piloto en una pequeña fracción de la flota se comporta en línea con los niveles de seguridad esperados."); a6_1.setNivelCapacidadEsperado(2); a6_1.setCalificacionActual("N");
        Actividad a6_2 = new Actividad(); a6_2.setPractica(pract06); a6_2.setDescripcionActividad("Controlar la distribución inalámbrica automática para garantizar que los binarios solo se instalen en números de chasis (VIN) autorizados y compatibles."); a6_2.setNivelCapacidadEsperado(2); a6_2.setCalificacionActual("N");
        Actividad a6_3 = new Actividad(); a6_3.setPractica(pract06); a6_3.setDescripcionActividad("Asegurar que la promoción a producción de los parches de infraestructura Cloud y software automotriz se archive de manera segura en la biblioteca de medios."); a6_3.setNivelCapacidadEsperado(2); a6_3.setCalificacionActual("N");
        pract06.setActividades(Arrays.asList(a6_1, a6_2, a6_3));

        // Práctica 7
        PracticaCobit pract07 = new PracticaCobit();
        pract07.setComponente(compA);
        pract07.setIdPractica("BAI07.07");
        pract07.setNombrePractica("Proporcionar soporte oportuno en producción");
        pract07.setDescripcionPractica("Proporcionar soporte inmediato a los concesionarios y conductores para resolver anomalías de software en la fase de estabilización.");
        Actividad a7_1 = new Actividad(); a7_1.setPractica(pract07); a7_1.setDescripcionActividad("Proporcionar recursos adicionales a la mesa de ayuda (Service Desk) y concesionarios hasta que la nueva versión del sistema operativo vehicular se estabilice."); a7_1.setNivelCapacidadEsperado(3); a7_1.setCalificacionActual("N");
        Actividad a7_2 = new Actividad(); a7_2.setPractica(pract07); a7_2.setDescripcionActividad("Asignar recursos adicionales al monitoreo de la nube en tiempo real (NOC/SOC) durante las primeras semanas post-despliegue."); a7_2.setNivelCapacidadEsperado(3); a7_2.setCalificacionActual("N");
        pract07.setActividades(Arrays.asList(a7_1, a7_2)); // COBIT documenta principalmente estas dos.

        // Práctica 8
        PracticaCobit pract08 = new PracticaCobit();
        pract08.setComponente(compA);
        pract08.setIdPractica("BAI07.08");
        pract08.setNombrePractica("Realizar una revisión post-implementación");
        pract08.setDescripcionPractica("Realizar revisiones post-mortem de la actualización OTA para confirmar los resultados, asegurar la mitigación de riesgos e identificar áreas de mejora en el ciclo.");
        Actividad a8_1 = new Actividad(); a8_1.setPractica(pract08); a8_1.setDescripcionActividad("Establecer procedimientos para evaluar en qué medida se mitigaron los riesgos cibernéticos clave y se garantizó la seguridad mecánica de la flota."); a8_1.setNivelCapacidadEsperado(3); a8_1.setCalificacionActual("N");
        Actividad a8_2 = new Actividad(); a8_2.setPractica(pract08); a8_2.setDescripcionActividad("Consultar a los directivos técnicos sobre métricas post-despliegue para verificar si hubo impactos inesperados en la experiencia del conductor."); a8_2.setNivelCapacidadEsperado(4); a8_2.setCalificacionActual("N");
        Actividad a8_3 = new Actividad(); a8_3.setPractica(pract08); a8_3.setDescripcionActividad("Acordar e implementar planes de acción vinculantes para solucionar los cuellos de botella de red identificados durante el pico de descargas vehiculares."); a8_3.setNivelCapacidadEsperado(5); a8_3.setCalificacionActual("N");
        pract08.setActividades(Arrays.asList(a8_1, a8_2, a8_3));

        compA.setPracticas(Arrays.asList(pract01, pract02, pract03, pract04, pract05, pract06, pract07, pract08));
        bai07.setComponenteA_Procesos(Arrays.asList(compA));

        // ==========================================
        // COMPONENTE B: ESTRUCTURAS ORGANIZATIVAS
        // ==========================================
        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(bai07); raci1.setPracticaGestion("BAI07.05"); raci1.setRolOrganizacional("Director de TI"); raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(bai07); raci2.setPracticaGestion("BAI07.06"); raci2.setRolOrganizacional("Jefe de operaciones de TI"); raci2.setNivelResponsabilidad("R");
        MatrizRaci raci3 = new MatrizRaci(); raci3.setProceso(bai07); raci3.setPracticaGestion("BAI07.08"); raci3.setRolOrganizacional("Director de TI"); raci3.setNivelResponsabilidad("A");
        bai07.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3));

        // ==========================================
        // COMPONENTE C: FLUJOS DE INFORMACIÓN
        // ==========================================
        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(bai07); flujo1.setPracticaGestion("BAI07.03"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: BAI03.07"); flujo1.setDescripcion("Plan de pruebas y Procedimientos de pruebas.");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(bai07); flujo2.setPracticaGestion("BAI07.05"); flujo2.setTipoFlujo("SALIDA"); flujo2.setOrigenDestino("A: BAI01.04 / BAI01.06"); flujo2.setDescripcion("Aceptación formal y liberación aprobada para la promoción OTA a producción.");
        bai07.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2));

        // ==========================================
        // COMPONENTE D: HABILIDADES PROFESIONALES
        // ==========================================
        Habilidad hab1 = new Habilidad(); hab1.setProceso(bai07); hab1.setNombreHabilidad("Liberación, despliegue y Aceptación del servicio"); hab1.setDocumentacionRelacionada("Skills Framework for the Information Age V6, 2015"); hab1.setReferenciaEspecifica("Identificador: RELM / SEAC. Capacidades especializadas para el despliegue a gran escala.");
        bai07.setComponenteD_Habilidades(Arrays.asList(hab1));

        // ==========================================
        // COMPONENTE E: POLÍTICAS INSTITUCIONALES
        // ==========================================
        Politica pol1 = new Politica(); pol1.setProceso(bai07); pol1.setTituloPolitica("Política de gestión de cambios de TI y Despliegues"); pol1.setDescripcionPolitica("Comunica a la dirección la intención estricta de que todos los lanzamientos de software a la flota se gestionen e implementen minimizando el riesgo vital del conductor y el impacto mecánico."); pol1.setDocumentacionRelacionada("ITIL V3, Service Transition"); pol1.setReferenciaEspecifica("4.4 Release and Deployment Management.");
        bai07.setComponenteE_Politicas(Arrays.asList(pol1));

        // ==========================================
        // COMPONENTE F: CULTURA DE TRABAJO
        // ==========================================
        Cultura cult1 = new Cultura(); cult1.setProceso(bai07); cult1.setElementoCultural("Cultura de Precaución y Comunicación Oportuna"); cult1.setDocumentacionRelacionada("Marco de Excelencia Operativa"); cult1.setReferenciaEspecifica("Establecer una cultura que garantice la comunicación oportuna de los calendarios de actualización de software a los clientes y redes de concesionarios, priorizando la transparencia operativa.");
        bai07.setComponenteF_Cultura(Arrays.asList(cult1));

        // ==========================================
        // COMPONENTE G: SERVICIOS Y HERRAMIENTAS
        // ==========================================
        Servicio serv1 = new Servicio(); serv1.setProceso(bai07); serv1.setNombreServicioHerramienta("Plataformas automatizadas de gestión de liberaciones OTA");
        Servicio serv2 = new Servicio(); serv2.setProceso(bai07); serv2.setNombreServicioHerramienta("Herramientas de monitorización de infraestructura en la nube");
        bai07.setComponenteG_Servicios(Arrays.asList(serv1, serv2));

        procesoRepository.save(bai07);
    }
}