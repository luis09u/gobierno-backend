package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Order(39) // Continuación de la evaluación ejecutiva en el dominio MEA
public class Seeder_39_MEA03 implements CommandLineRunner {

    private final ProcesoCobitRepository procesoRepository;

    public Seeder_39_MEA03(ProcesoCobitRepository procesoRepository) {
        this.procesoRepository = procesoRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (!procesoRepository.existsById("MEA03")) {
            System.out.println("Iniciando carga de datos de cumplimiento legal externo: MEA03...");
            cargarMEA03();
            System.out.println("MEA03 (Gestión del Cumplimiento de los Requisitos Externos) cargado exitosamente.");
        }
    }

    private void cargarMEA03() {
        // ==========================================
        // INFORMACIÓN GENERAL (ENFOQUE DE LEGALIDAD Y PROTECCIÓN)
        // ==========================================
        ProcesoCobit mea03 = new ProcesoCobit();
        mea03.setIdProceso("MEA03");
        mea03.setDominio("Monitorizar, Evaluar y Valorar");
        mea03.setAreaPrioritaria("Modelo Core de COBIT");
        mea03.setNombreProceso("Gestionar el cumplimiento de los requisitos externos");
        mea03.setDescripcionProceso("Identificar, evaluar y acatar de manera rigurosa todas las leyes, regulaciones gubernamentales y obligaciones contractuales externas vinculadas al uso de la tecnología, asegurando que la empresa opere siempre dentro de los márgenes de la legalidad internacional y local.");
        mea03.setPropositoProceso("Garantizar que la recolección masiva de datos telemáticos de los vehículos y el procesamiento de la información financiera en los concesionarios no infrinjan ninguna ley de privacidad o norma de protección al consumidor, resguardando a la organización contra litigios civiles y multas regulatorias.");

        mea03.setMetasAlineamiento("AG02: Gestión integral del riesgo corporativo asegurando el cumplimiento normativo.\nAG11: Adherencia estricta a las políticas institucionales de resguardo de información frente a terceros.");
        mea03.setMetasEmpresariales("EG03: Cumplimiento irrestricto de las leyes externas y regulaciones dictadas por los gobiernos locales.\nEG02: Optimización del perfil de riesgo y protección absoluta del prestigio de la marca.");
        mea03.setMetricasModelo("Métrica 1: Número de sanciones económicas o advertencias legales recibidas por parte de entidades gubernamentales debido a deficiencias informáticas durante el año fiscal.\nMétrica 2: Costo financiero total asociado al pago de multas regulatorias o acuerdos extrajudiciales derivados de incumplimientos tecnológicos.");

        // ==========================================
        // COMPONENTE A: PRÁCTICAS Y ACTIVIDADES DE CUMPLIMIENTO
        // ==========================================
        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(mea03);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("MEA03.01");
        pract01.setNombrePractica("Identificar los requisitos legales y normativos externos");
        pract01.setDescripcionPractica("Escanear continuamente el entorno jurídico global para detectar nuevas leyes o regulaciones que obliguen a la empresa a modificar la arquitectura de sus sistemas de información.");
        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Establecer un observatorio jurídico que informe a la gerencia técnica cada vez que un país apruebe nuevas restricciones sobre el almacenamiento en la nube de los recorridos vehiculares."); a1_1.setNivelCapacidadEsperado(4); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Traducir el lenguaje jurídico complejo de las leyes de protección al consumidor en requerimientos de programación claros para los ingenieros de sistemas."); a1_2.setNivelCapacidadEsperado(3); a1_2.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2));

        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("MEA03.02");
        pract02.setNombrePractica("Optimizar la respuesta ante las regulaciones");
        pract02.setDescripcionPractica("Ajustar las plataformas operativas y los procedimientos técnicos para satisfacer las exigencias de la ley sin sacrificar la agilidad comercial de la compañía.");
        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Reescribir el código de las aplicaciones móviles de la marca para incluir la opción de borrado definitivo de datos personales, cumpliendo así con el derecho al olvido exigido por la legislación vigente."); a2_1.setNivelCapacidadEsperado(4); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Automatizar la generación de reportes fiscales requeridos por las entidades recaudadoras de impuestos, reduciendo el esfuerzo administrativo de los concesionarios y erradicando los errores de cálculo."); a2_2.setNivelCapacidadEsperado(4); a2_2.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2));

        PracticaCobit pract03 = new PracticaCobit();
        pract03.setComponente(compA);
        pract03.setIdPractica("MEA03.04");
        pract03.setNombrePractica("Obtener garantías formales de cumplimiento");
        pract03.setDescripcionPractica("Someter la infraestructura tecnológica a evaluaciones por parte de entes certificadores independientes para demostrar ante la justicia que la empresa opera bajo los más altos estándares legales.");
        Actividad a3_1 = new Actividad(); a3_1.setPractica(pract03); a3_1.setDescripcionActividad("Contratar firmas de auditoría externas de prestigio internacional para que certifiquen anualmente que los sistemas de pago en línea de la marca son impenetrables."); a3_1.setNivelCapacidadEsperado(3); a3_1.setCalificacionActual("N");
        Actividad a3_2 = new Actividad(); a3_2.setPractica(pract03); a3_2.setDescripcionActividad("Archivar de forma segura y criptográfica todos los certificados de cumplimiento normativo, garantizando su disponibilidad inmediata ante cualquier requerimiento formal de un juez o autoridad regulatoria."); a3_2.setNivelCapacidadEsperado(3); a3_2.setCalificacionActual("N");
        pract03.setActividades(Arrays.asList(a3_1, a3_2));

        compA.setPracticas(Arrays.asList(pract01, pract02, pract03));
        mea03.setComponenteA_Procesos(Arrays.asList(compA));

        // ==========================================
        // COMPONENTE B: ESTRUCTURAS ORGANIZATIVAS
        // ==========================================
        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(mea03); raci1.setPracticaGestion("MEA03.01"); raci1.setRolOrganizacional("Director Jurídico y Asesoría Legal Corporativa"); raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(mea03); raci2.setPracticaGestion("MEA03.02"); raci2.setRolOrganizacional("Director Oficial de Cumplimiento Normativo"); raci2.setNivelResponsabilidad("R");
        MatrizRaci raci3 = new MatrizRaci(); raci3.setProceso(mea03); raci3.setPracticaGestion("MEA03.04"); raci3.setRolOrganizacional("Junta Directiva Institucional"); raci3.setNivelResponsabilidad("C");

        mea03.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3));

        // ==========================================
        // COMPONENTE C: FLUJOS DE INFORMACIÓN
        // ==========================================
        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(mea03); flujo1.setPracticaGestion("MEA03.01"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: Reguladores externos y asesores legales"); flujo1.setDescripcion("Decretos gubernamentales, jurisprudencia internacional y notificaciones formales de actualización normativa aplicables al sector tecnológico automotriz.");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(mea03); flujo2.setPracticaGestion("MEA03.04"); flujo2.setTipoFlujo("SALIDA"); flujo2.setOrigenDestino("A: APO12.01"); flujo2.setDescripcion("Dictámenes formales de auditoría externa y certificados de cumplimiento para alimentar el perfil general de riesgo corporativo.");

        mea03.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2));

        // ==========================================
        // COMPONENTE D: HABILIDADES PROFESIONALES
        // ==========================================
        Habilidad hab1 = new Habilidad(); hab1.setProceso(mea03); hab1.setNombreHabilidad("Derecho Informático y Gestión de Auditorías Regulatorias Externas"); hab1.setDocumentacionRelacionada("Reglamento General de Protección de Datos emitido por las autoridades europeas (RGPD) Reglamento UE 2016/679"); hab1.setReferenciaEspecifica("De este cuerpo normativo internacional se extrae explícitamente la obligación de incorporar la privacidad desde el diseño original de los sistemas informáticos, garantizando que el cumplimiento legal no sea un parche administrativo posterior, sino un pilar fundamental en el desarrollo de la tecnología corporativa.");

        mea03.setComponenteD_Habilidades(Arrays.asList(hab1));

        // ==========================================
        // COMPONENTE E: POLÍTICAS INSTITUCIONALES SI
        // ==========================================
        Politica pol1 = new Politica(); pol1.setProceso(mea03); pol1.setTituloPolitica("Directiva Corporativa de Cero Tolerancia a la Infracción Legal"); pol1.setDescripcionPolitica("Mandato institucional inflexible que prohíbe el lanzamiento comercial de cualquier plataforma tecnológica, modelo de vehículo conectado o servicio digital si este no cuenta con un dictamen jurídico favorable que certifique su cumplimiento absoluto con las leyes locales e internacionales. Esta política subordina las metas de ventas a las obligaciones regulatorias."); pol1.setDocumentacionRelacionada("Estatuto Institucional de Conducta Legal y Ética Empresarial"); pol1.setReferenciaEspecifica("Sección: Requisitos Legales Obligatorios para Nuevos Mercados");

        mea03.setComponenteE_Politicas(Arrays.asList(pol1));

        // ==========================================
        // COMPONENTE F: CULTURA DE TRABAJO
        // ==========================================
        Cultura cult1 = new Cultura(); cult1.setProceso(mea03); cult1.setElementoCultural("Cultura de Respeto Ciudadano y Cumplimiento Proactivo"); cult1.setDocumentacionRelacionada("Declaración de Valores y Responsabilidad Social Corporativa"); cult1.setReferenciaEspecifica("Fomentar en toda la organización la convicción de que el cumplimiento de las leyes no es un simple ejercicio burocrático para evitar multas, sino un compromiso ético innegociable que demuestra el respeto de la empresa hacia la privacidad y seguridad de sus consumidores globales.");

        mea03.setComponenteF_Cultura(Arrays.asList(cult1));

        // ==========================================
        // COMPONENTE G: SERVICIOS Y HERRAMIENTAS
        // ==========================================
        Servicio serv1 = new Servicio(); serv1.setProceso(mea03); serv1.setNombreServicioHerramienta("Plataformas Digitales de Vigilancia Jurídica y Gestión de Cumplimiento Normativo");
        Servicio serv2 = new Servicio(); serv2.setProceso(mea03); serv2.setNombreServicioHerramienta("Bases de Datos Centralizadas para el Resguardo Criptográfico de Evidencias Legales y Certificaciones Externas");

        mea03.setComponenteG_Servicios(Arrays.asList(serv1, serv2));

        procesoRepository.save(mea03);
    }
}