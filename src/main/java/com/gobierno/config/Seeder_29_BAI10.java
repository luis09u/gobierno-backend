package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Order(28) // Secuencia en el dominio BAI
public class Seeder_29_BAI10 implements CommandLineRunner {

    private final ProcesoCobitRepository procesoRepository;

    public Seeder_29_BAI10(ProcesoCobitRepository procesoRepository) {
        this.procesoRepository = procesoRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (!procesoRepository.existsById("BAI10")) {
            System.out.println("Iniciando carga de datos oficiales: BAI10...");
            cargarBAI10();
            System.out.println("BAI10 (Gestionar la configuración) cargado exitosamente.");
        }
    }

    private void cargarBAI10() {
        // ==========================================
        // INFORMACIÓN GENERAL (COBIT 2019 OFICIAL)
        // ==========================================
        ProcesoCobit bai10 = new ProcesoCobit();
        bai10.setIdProceso("BAI10");
        bai10.setDominio("Construir, Adquirir e Implementar");
        bai10.setAreaPrioritaria("Modelo Core de COBIT");
        bai10.setNombreProceso("Gestionar la configuración");
        bai10.setDescripcionProceso("Definir y mantener descripciones y relaciones entre recursos claves y las capacidades necesarias para ofrecer servicios habilitados por I&T. Incluye la recopilación de información sobre configuración, líneas de referencia y auditorías del repositorio.");
        bai10.setPropositoProceso("Proporcionar información precisa sobre los activos para facilitar que el servicio OTA se gestione de forma segura. Evaluar el impacto de los cambios de firmware y evitar incompatibilidades de hardware (bricking) en la flota vehicular.");

        bai10.setMetasAlineamiento("AG07: Seguridad de la información, infraestructura de procesamiento, aplicaciones y privacidad.");
        bai10.setMetasEmpresariales("EG02: Gestión del riesgo de negocio.\nEG06: Continuidad y disponibilidad del servicio del negocio.");
        bai10.setMetricasModelo("Métrica 1: Número de horas de procesamiento de negocio (o vehículos inactivos) perdidas debido a interrupciones no planificadas o parches incompatibles (EG06).\nMétrica 2: Frecuencia de actualización del perfil de riesgo de compatibilidad de la flota (EG02).");

        // ==========================================
        // COMPONENTE A: PRÁCTICAS Y ACTIVIDADES (Enfoque OTA)
        // ==========================================
        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(bai10);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        // Práctica 1
        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("BAI10.01");
        pract01.setNombrePractica("Establecer y mantener un modelo de configuración");
        pract01.setDescripcionPractica("Establecer y mantener un modelo lógico de servicios, infraestructura y registro de los Elementos de Configuración (CI), incluyendo las relaciones entre estos.");
        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Definir y acordar el alcance y nivel de detalle sobre la gestión de configuración (ej. mapear números de chasis VIN con versiones exactas de hardware ECU)."); a1_1.setNivelCapacidadEsperado(3); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Establecer un modelo lógico para la gestión de la configuración que abarque desde los clústeres en la nube (AWS) hasta el software embebido del auto."); a1_2.setNivelCapacidadEsperado(3); a1_2.setCalificacionActual("N");
        Actividad a1_3 = new Actividad(); a1_3.setPractica(pract01); a1_3.setDescripcionActividad("Identificar los CIs que se consideran estrictamente necesarios para gestionar actualizaciones inalámbricas (OTA) sin causar colapsos mecánicos."); a1_3.setNivelCapacidadEsperado(4); a1_3.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2, a1_3));

        // Práctica 2
        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("BAI10.02");
        pract02.setNombrePractica("Establecer y mantener un repositorio de configuración y una línea de referencia");
        pract02.setDescripcionPractica("Establecer una base de datos centralizada (CMDB) y crear líneas de referencia de configuración controladas para cada modelo de vehículo.");
        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Identificar y clasificar los elementos de configuración (componentes mecánicos y software) y poblar el repositorio de gemelos digitales."); a2_1.setNivelCapacidadEsperado(2); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Crear, revisar y acordar formalmente las líneas de referencia de software estables para cada familia de vehículos en producción."); a2_2.setNivelCapacidadEsperado(3); a2_2.setCalificacionActual("N");
        Actividad a2_3 = new Actividad(); a2_3.setPractica(pract02); a2_3.setDescripcionActividad("Integrar la línea de base de configuración con los protocolos de seguridad definidos para garantizar el despliegue a los modelos correctos."); a2_3.setNivelCapacidadEsperado(4); a2_3.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2, a2_3));

        // Práctica 3
        PracticaCobit pract03 = new PracticaCobit();
        pract03.setComponente(compA);
        pract03.setIdPractica("BAI10.03");
        pract03.setNombrePractica("Mantener y controlar los elementos de configuración");
        pract03.setDescripcionPractica("Mantener el repositorio (CMDB) constantemente actualizado, registrando inmediatamente cualquier cambio que sufra la configuración del automóvil o los servidores.");
        Actividad a3_1 = new Actividad(); a3_1.setPractica(pract03); a3_1.setDescripcionActividad("Identificar regularmente todos los cambios a los CIs, como actualizaciones previas realizadas físicamente en concesionarios."); a3_1.setNivelCapacidadEsperado(2); a3_1.setCalificacionActual("N");
        Actividad a3_2 = new Actividad(); a3_2.setPractica(pract03); a3_2.setDescripcionActividad("Para asegurar la integridad, revisar los cambios de configuración del auto transmitidos por telemetría y compararlos con la línea de referencia central."); a3_2.setNivelCapacidadEsperado(3); a3_2.setCalificacionActual("N");
        Actividad a3_3 = new Actividad(); a3_3.setPractica(pract03); a3_3.setDescripcionActividad("Actualizar de forma automatizada los detalles de configuración para reflejar el éxito de una descarga OTA en un vehículo específico."); a3_3.setNivelCapacidadEsperado(4); a3_3.setCalificacionActual("N");
        pract03.setActividades(Arrays.asList(a3_1, a3_2, a3_3));

        // Práctica 4
        PracticaCobit pract04 = new PracticaCobit();
        pract04.setComponente(compA);
        pract04.setIdPractica("BAI10.04");
        pract04.setNombrePractica("Generar informes de estado y de la configuración");
        pract04.setDescripcionPractica("Definir y generar informes sobre los cambios de estado en los elementos de la configuración, resaltando anomalías o intervenciones no autorizadas.");
        Actividad a4_1 = new Actividad(); a4_1.setPractica(pract04); a4_1.setDescripcionActividad("Identificar los cambios de estado y alertar cuando la configuración reportada por el auto no coincide con la CMDB."); a4_1.setNivelCapacidadEsperado(2); a4_1.setCalificacionActual("N");
        Actividad a4_2 = new Actividad(); a4_2.setPractica(pract04); a4_2.setDescripcionActividad("Relacionar los cambios con el comité de gestión de cambios (CAB) para identificar alteraciones no autorizadas (ej. hackeos o tuning casero)."); a4_2.setNivelCapacidadEsperado(3); a4_2.setCalificacionActual("N");
        Actividad a4_3 = new Actividad(); a4_3.setPractica(pract04); a4_3.setDescripcionActividad("Producir informes ejecutivos para los directivos indicando el porcentaje de la flota que se encuentra en la última versión de software."); a4_3.setNivelCapacidadEsperado(4); a4_3.setCalificacionActual("N");
        pract04.setActividades(Arrays.asList(a4_1, a4_2, a4_3));

        // Práctica 5
        PracticaCobit pract05 = new PracticaCobit();
        pract05.setComponente(compA);
        pract05.setIdPractica("BAI10.05");
        pract05.setNombrePractica("Verificar y revisar la integridad del repositorio de configuración");
        pract05.setDescripcionPractica("Revisar periódicamente el repositorio y verificar su precisión mediante herramientas de descubrimiento y telemetría en tiempo real.");
        Actividad a5_1 = new Actividad(); a5_1.setPractica(pract05); a5_1.setDescripcionActividad("Comprobar las configuraciones físicas reales con respecto al repositorio, usando herramientas de escaneo en la red celular 5G."); a5_1.setNivelCapacidadEsperado(4); a5_1.setCalificacionActual("N");
        Actividad a5_2 = new Actividad(); a5_2.setPractica(pract05); a5_2.setDescripcionActividad("Establecer y revisar el objetivo de precisión de la CMDB, exigiendo un 99.9% de fidelidad para evitar enviar actualizaciones fatales a la flota."); a5_2.setNivelCapacidadEsperado(5); a5_2.setCalificacionActual("N");
        Actividad a5_3 = new Actividad(); a5_3.setPractica(pract05); a5_3.setDescripcionActividad("Llevar a cabo acciones correctivas inmediatas para depurar la base de datos si se detecta que las versiones de hardware almacenadas están obsoletas."); a5_3.setNivelCapacidadEsperado(5); a5_3.setCalificacionActual("N");
        pract05.setActividades(Arrays.asList(a5_1, a5_2, a5_3));

        compA.setPracticas(Arrays.asList(pract01, pract02, pract03, pract04, pract05));
        bai10.setComponenteA_Procesos(Arrays.asList(compA));

        // ==========================================
        // COMPONENTE B: ESTRUCTURAS ORGANIZATIVAS
        // ==========================================
        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(bai10); raci1.setPracticaGestion("BAI10.02"); raci1.setRolOrganizacional("Director de TI"); raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(bai10); raci2.setPracticaGestion("BAI10.03"); raci2.setRolOrganizacional("Jefe de arquitectura / Jefe de operaciones de TI"); raci2.setNivelResponsabilidad("R");
        MatrizRaci raci3 = new MatrizRaci(); raci3.setProceso(bai10); raci3.setPracticaGestion("BAI10.05"); raci3.setRolOrganizacional("Gestor de servicios / Jefe de administración de TI"); raci3.setNivelResponsabilidad("R");
        bai10.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3));

        // ==========================================
        // COMPONENTE C: FLUJOS DE INFORMACIÓN
        // ==========================================
        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(bai10); flujo1.setPracticaGestion("BAI10.02"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: BAI03.11 / BAI03.12 / BAI09.05"); flujo1.setDescripcion("Registro de licencias de software y metodologías de las líneas de base.");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(bai10); flujo2.setPracticaGestion("BAI10.02"); flujo2.setTipoFlujo("SALIDA"); flujo2.setOrigenDestino("A: BAI09.01 / DSS02.01"); flujo2.setDescripcion("Repositorio de configuraciones maestras (CMDB) y Configuración de línea de referencia (Gemelo Digital).");
        bai10.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2));

        // ==========================================
        // COMPONENTE D: HABILIDADES PROFESIONALES
        // ==========================================
        Habilidad hab1 = new Habilidad(); hab1.setProceso(bai10); hab1.setNombreHabilidad("Gestión de la configuración y trazabilidad"); hab1.setDocumentacionRelacionada("Skills Framework for the Information Age V6, 2015"); hab1.setReferenciaEspecifica("Identificador: CFMG. Capacidad técnica de modelar el ciclo de vida de los activos y mantener una única fuente de verdad (Single Source of Truth).");
        bai10.setComponenteD_Habilidades(Arrays.asList(hab1));

        // ==========================================
        // COMPONENTE E: POLÍTICAS INSTITUCIONALES
        // ==========================================
        Politica pol1 = new Politica(); pol1.setProceso(bai10); pol1.setTituloPolitica("Política de gestión de la configuración"); pol1.setDescripcionPolitica("Comunica las directrices para el establecimiento de un repositorio de configuración (CMDB) estricto. Garantiza que los cambios de firmware OTA se coordinen evitando conflictos de versiones o despliegues en hardware no compatible."); pol1.setDocumentacionRelacionada("NIST Special Publication 800-53"); pol1.setReferenciaEspecifica("3.5 Configuration management (CM-6).");
        bai10.setComponenteE_Politicas(Arrays.asList(pol1));

        // ==========================================
        // COMPONENTE F: CULTURA DE TRABAJO
        // ==========================================
        Cultura cult1 = new Cultura(); cult1.setProceso(bai10); cult1.setElementoCultural("Cultura de Precisión y Control Estructurado"); cult1.setDocumentacionRelacionada("Manifiesto de Ingeniería Automotriz Segura"); cult1.setReferenciaEspecifica("Establecer una cultura transversal en la que los ingenieros reconozcan que evitar conflictos de versiones en la flota salva vidas. Exigir la aplicación de las reglas del repositorio sin excepciones.");
        bai10.setComponenteF_Cultura(Arrays.asList(cult1));

        // ==========================================
        // COMPONENTE G: SERVICIOS Y HERRAMIENTAS
        // ==========================================
        Servicio serv1 = new Servicio(); serv1.setProceso(bai10); serv1.setNombreServicioHerramienta("Herramientas y repositorios automatizados de gestión de la configuración (CMDB)");
        Servicio serv2 = new Servicio(); serv2.setProceso(bai10); serv2.setNombreServicioHerramienta("Plataformas de inventariado y telemetría de red vehicular (Device Management)");
        bai10.setComponenteG_Servicios(Arrays.asList(serv1, serv2));

        procesoRepository.save(bai10);
    }
}