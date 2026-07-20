package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Order(39)
public class Seeder_39_MEA03 implements CommandLineRunner {

    private final ProcesoCobitRepository procesoRepository;

    public Seeder_39_MEA03(ProcesoCobitRepository procesoRepository) {
        this.procesoRepository = procesoRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (!procesoRepository.existsById("MEA03")) {
            cargarMEA03();
        }
    }

    private void cargarMEA03() {
        ProcesoCobit mea03 = new ProcesoCobit();
        mea03.setIdProceso("MEA03");
        mea03.setDominio("Monitorizar, Evaluar y Valorar");
        mea03.setAreaPrioritaria("Modelo Core de COBIT");
        mea03.setNombreProceso("Gestionar el cumplimiento de los requerimientos externos");
        mea03.setDescripcionProceso("Evaluar que los procesos de I&T y los procesos de negocio soportados por I&T cumplen con las leyes, las regulaciones y los requisitos contractuales aplicables. Obtener garantías de que los requisitos se han identificado y se están cumpliendo, e integrar el cumplimiento de TI en el cumplimiento general de la empresa.");
        mea03.setPropositoProceso("Garantizar que la recolección masiva de datos telemáticos de los vehículos y el procesamiento de la información financiera en los concesionarios no infrinjan ninguna ley de privacidad o norma de protección al consumidor, resguardando a la organización contra litigios civiles y multas regulatorias.");

        mea03.setMetasAlineamiento("AG01: Cumplimiento y soporte de la I&T a la conformidad externa de leyes y regulaciones.\nAG02: Gestión de riesgos relacionados con I&T.");
        mea03.setMetasEmpresariales("EG03: Cumplimiento de leyes y regulaciones externas.\nEG02: Riesgo de negocio gestionado.");
        mea03.setMetricasModelo("Métrica 1: Coste del incumplimiento regulatorio, incluyendo liquidaciones y multas.\nMétrica 2: Número de incidentes de incumplimiento relacionados con TI notificados a la junta directiva.");

        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(mea03);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("MEA03.01");
        pract01.setNombrePractica("Identificar los requisitos de cumplimiento de leyes y regulaciones externas");
        pract01.setDescripcionPractica("Revisar constantemente el entorno para identificar cambios en el entorno normativo o legislativo a nivel local e internacional.");
        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Identificar todas las regulaciones, leyes, contratos y estándares externos que tengan requisitos relacionados con las TI."); a1_1.setNivelCapacidadEsperado(2); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Analizar y evaluar el impacto potencial de las nuevas leyes y regulaciones en las políticas y prácticas de TI existentes."); a1_2.setNivelCapacidadEsperado(3); a1_2.setCalificacionActual("N");
        Actividad a1_3 = new Actividad(); a1_3.setPractica(pract01); a1_3.setDescripcionActividad("Traducir los requisitos legales externos en políticas corporativas y procedimientos operativos estándar de TI."); a1_3.setNivelCapacidadEsperado(4); a1_3.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2, a1_3));

        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("MEA03.02");
        pract02.setNombrePractica("Optimizar la respuesta a los requerimientos externos");
        pract02.setDescripcionPractica("Revisar y ajustar las políticas, procedimientos y arquitectura técnica para garantizar el cumplimiento de las regulaciones externas, integrando el cumplimiento con las operaciones de negocio diarias.");
        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Ajustar las políticas y normas internas de TI para garantizar el cumplimiento de los requerimientos legales y regulatorios."); a2_1.setNivelCapacidadEsperado(2); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Implementar o ajustar los controles y procesos en respuesta a los cambios en las obligaciones de cumplimiento externas."); a2_2.setNivelCapacidadEsperado(3); a2_2.setCalificacionActual("N");
        Actividad a2_3 = new Actividad(); a2_3.setPractica(pract02); a2_3.setDescripcionActividad("Integrar las actividades de cumplimiento de TI con la función de cumplimiento general de la empresa."); a2_3.setNivelCapacidadEsperado(4); a2_3.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2, a2_3));

        PracticaCobit pract03 = new PracticaCobit();
        pract03.setComponente(compA);
        pract03.setIdPractica("MEA03.04");
        pract03.setNombrePractica("Obtener garantías del cumplimiento externo");
        pract03.setDescripcionPractica("Proporcionar garantías de que la empresa cumple con las regulaciones externas aplicables y puede demostrarlo mediante evaluaciones formales y auditorías.");
        Actividad a3_1 = new Actividad(); a3_1.setPractica(pract03); a3_1.setDescripcionActividad("Monitorizar regularmente las actividades operativas de TI para asegurar que los controles de cumplimiento funcionan eficazmente."); a3_1.setNivelCapacidadEsperado(3); a3_1.setCalificacionActual("N");
        Actividad a3_2 = new Actividad(); a3_2.setPractica(pract03); a3_2.setDescripcionActividad("Obtener y confirmar certificaciones de cumplimiento normativo (ej. auditorías independientes) como evidencia formal ante las autoridades."); a3_2.setNivelCapacidadEsperado(4); a3_2.setCalificacionActual("N");
        pract03.setActividades(Arrays.asList(a3_1, a3_2));

        compA.setPracticas(Arrays.asList(pract01, pract02, pract03));
        mea03.setComponenteA_Procesos(Arrays.asList(compA));

        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(mea03); raci1.setPracticaGestion("MEA03.01"); raci1.setRolOrganizacional("Director Jurídico y Asesoría Legal Corporativa"); raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(mea03); raci2.setPracticaGestion("MEA03.02"); raci2.setRolOrganizacional("Director Oficial de Cumplimiento Normativo"); raci2.setNivelResponsabilidad("R");
        MatrizRaci raci3 = new MatrizRaci(); raci3.setProceso(mea03); raci3.setPracticaGestion("MEA03.04"); raci3.setRolOrganizacional("Junta Directiva Institucional"); raci3.setNivelResponsabilidad("C");
        mea03.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3));

        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(mea03); flujo1.setPracticaGestion("MEA03.01"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: Reguladores externos y asesores legales"); flujo1.setDescripcion("Decretos gubernamentales, jurisprudencia internacional y notificaciones formales de actualización normativa aplicables al sector tecnológico automotriz.");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(mea03); flujo2.setPracticaGestion("MEA03.04"); flujo2.setTipoFlujo("SALIDA"); flujo2.setOrigenDestino("A: APO12.01"); flujo2.setDescripcion("Dictámenes formales de auditoría externa y certificados de cumplimiento para alimentar el perfil general de riesgo corporativo.");
        mea03.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2));

        Habilidad hab1 = new Habilidad(); hab1.setProceso(mea03); hab1.setNombreHabilidad("Derecho Informático y Gestión de Auditorías Regulatorias Externas"); hab1.setDocumentacionRelacionada("Reglamento General de Protección de Datos emitido por las autoridades europeas (RGPD) Reglamento UE 2016/679"); hab1.setReferenciaEspecifica("De este cuerpo normativo internacional se extrae explícitamente la obligación de incorporar la privacidad desde el diseño original de los sistemas informáticos, garantizando que el cumplimiento legal no sea un parche administrativo posterior, sino un pilar fundamental en el desarrollo de la tecnología corporativa.");
        mea03.setComponenteD_Habilidades(Arrays.asList(hab1));

        Politica pol1 = new Politica(); pol1.setProceso(mea03); pol1.setTituloPolitica("Directiva Corporativa de Cero Tolerancia a la Infracción Legal"); pol1.setDescripcionPolitica("Mandato institucional inflexible que prohíbe el lanzamiento comercial de cualquier plataforma tecnológica, modelo de vehículo conectado o servicio digital si este no cuenta con un dictamen jurídico favorable que certifique su cumplimiento absoluto con las leyes locales e internacionales. Esta política subordina las metas de ventas a las obligaciones regulatorias."); pol1.setDocumentacionRelacionada("Estatuto Institucional de Conducta Legal y Ética Empresarial"); pol1.setReferenciaEspecifica("Sección: Requisitos Legales Obligatorios para Nuevos Mercados");
        mea03.setComponenteE_Politicas(Arrays.asList(pol1));

        Cultura cult1 = new Cultura(); cult1.setProceso(mea03); cult1.setElementoCultural("Cultura de Respeto Ciudadano y Cumplimiento Proactivo"); cult1.setDocumentacionRelacionada("Declaración de Valores y Responsabilidad Social Corporativa"); cult1.setReferenciaEspecifica("Fomentar en toda la organización la convicción de que el cumplimiento de las leyes no es un simple ejercicio burocrático para evitar multas, sino un compromiso ético innegociable que demuestra el respeto de la empresa hacia la privacidad y seguridad de sus consumidores globales.");
        mea03.setComponenteF_Cultura(Arrays.asList(cult1));

        Servicio serv1 = new Servicio(); serv1.setProceso(mea03); serv1.setNombreServicioHerramienta("Plataformas Digitales de Vigilancia Jurídica y Gestión de Cumplimiento Normativo");
        Servicio serv2 = new Servicio(); serv2.setProceso(mea03); serv2.setNombreServicioHerramienta("Bases de Datos Centralizadas para el Resguardo Criptográfico de Evidencias Legales y Certificaciones Externas");
        mea03.setComponenteG_Servicios(Arrays.asList(serv1, serv2));

        procesoRepository.save(mea03);
    }
}