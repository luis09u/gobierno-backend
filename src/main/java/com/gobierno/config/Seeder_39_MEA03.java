package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Order(38) // Secuencia en el dominio MEA
public class Seeder_39_MEA03 implements CommandLineRunner {

    private final ProcesoCobitRepository procesoRepository;

    public Seeder_39_MEA03(ProcesoCobitRepository procesoRepository) {
        this.procesoRepository = procesoRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (!procesoRepository.existsById("MEA03")) {
            System.out.println("Iniciando carga de datos oficiales: MEA03...");
            cargarMEA03();
            System.out.println("MEA03 (Gestionar el cumplimiento de los requisitos externos) cargado exitosamente.");
        }
    }

    private void cargarMEA03() {
        // ==========================================
        // INFORMACIÓN GENERAL (COBIT 2019 OFICIAL)
        // ==========================================
        ProcesoCobit mea03 = new ProcesoCobit();
        mea03.setIdProceso("MEA03");
        mea03.setDominio("Monitorizar, Evaluar y Valorar");
        mea03.setAreaPrioritaria("Modelo Core de COBIT");
        mea03.setNombreProceso("Gestionar el cumplimiento de los requisitos externos");
        mea03.setDescripcionProceso("Evaluar si los procesos de I&T y los procesos de negocio apoyados por I&T cumplen con las leyes, regulaciones y requisitos contractuales. Asegurar que los requisitos se han identificado y cumplido.");
        mea03.setPropositoProceso("Asegurarse de que la empresa cumpla con todos los requisitos externos aplicables, garantizando la certificación legal del software vehicular frente a reguladores internacionales de transporte y agencias de protección de datos.");

        mea03.setMetasAlineamiento("AG01: Cumplimiento de I&T y soporte al cumplimiento del negocio con leyes y regulaciones externas.");
        mea03.setMetasEmpresariales("EG03: Cumplimiento de leyes y regulaciones externas.");
        mea03.setMetricasModelo("Métrica 1: Número de problemas de incumplimiento relacionados con el firmware reportados a los reguladores de tráfico y seguridad vial (EG03).\nMétrica 2: Coste de incumplimiento de TI, incluyendo multas por violaciones de privacidad en los datos del conductor y pérdida reputacional (AG01).");

        // ==========================================
        // COMPONENTE A: PRÁCTICAS Y ACTIVIDADES (Enfoque OTA)
        // ==========================================
        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(mea03);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        // Práctica 1
        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("MEA03.01");
        pract01.setNombrePractica("Identificar los requisitos externos de cumplimiento");
        pract01.setDescripcionPractica("Supervisar de forma continua los cambios en regulaciones de seguridad automotriz, normativas de emisiones de datos y leyes de privacidad globales.");
        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Identificar y evaluar el impacto de los requisitos legales (ej. GDPR, UNECE WP.29) sobre el flujo de datos telemáticos de la flota."); a1_1.setNivelCapacidadEsperado(2); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Mantener un registro actualizado de todos los requisitos regulatorios de transporte y evaluar su impacto en contratos con proveedores de telecomunicaciones 5G."); a1_2.setNivelCapacidadEsperado(3); a1_2.setCalificacionActual("N");
        Actividad a1_3 = new Actividad(); a1_3.setPractica(pract01); a1_3.setDescripcionActividad("Obtener asesoría legal independiente sobre nuevas leyes gubernamentales relacionadas con los sistemas de conducción autónoma."); a1_3.setNivelCapacidadEsperado(3); a1_3.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2, a1_3));

        // Práctica 2
        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("MEA03.02");
        pract02.setNombrePractica("Optimizar la respuesta a los requisitos externos");
        pract02.setDescripcionPractica("Revisar y ajustar las políticas de ciberseguridad vehicular para asegurar la adopción de los códigos y certificaciones de la industria automotriz.");
        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Revisar y ajustar los procedimientos de despliegue OTA para garantizar el cumplimiento de normativas gubernamentales."); a2_1.setNivelCapacidadEsperado(3); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Adoptar estándares de la industria, como las normas ISO/SAE 21434 para la gestión del riesgo de ciberseguridad en vehículos de carretera."); a2_2.setNivelCapacidadEsperado(3); a2_2.setCalificacionActual("N");
        Actividad a2_3 = new Actividad(); a2_3.setPractica(pract02); a2_3.setDescripcionActividad("Comunicar los requisitos de cumplimiento nuevos o modificados a todo el personal de ingeniería que desarrolla el sistema operativo base."); a2_3.setNivelCapacidadEsperado(3); a2_3.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2, a2_3));

        // Práctica 3
        PracticaCobit pract03 = new PracticaCobit();
        pract03.setComponente(compA);
        pract03.setIdPractica("MEA03.03");
        pract03.setNombrePractica("Confirmar el cumplimiento externo");
        pract03.setDescripcionPractica("Confirmar rigurosamente el cumplimiento del código vehicular y las políticas en la nube frente a los reguladores y auditores de transporte.");
        Actividad a3_1 = new Actividad(); a3_1.setPractica(pract03); a3_1.setDescripcionActividad("Evaluar periódicamente los procesos del negocio y de TI para asegurar que las unidades de control (ECUs) cumplen las homologaciones de seguridad."); a3_1.setNivelCapacidadEsperado(3); a3_1.setCalificacionActual("N");
        Actividad a3_2 = new Actividad(); a3_2.setPractica(pract03); a3_2.setDescripcionActividad("Revisar de manera continua los patrones recurrentes de fallos en auditorías de cumplimiento, identificando causas raíz relacionadas con el desarrollo de software."); a3_2.setNivelCapacidadEsperado(4); a3_2.setCalificacionActual("N");
        Actividad a3_3 = new Actividad(); a3_3.setPractica(pract03); a3_3.setDescripcionActividad("Mejorar las metodologías de despliegue basándose en las lecciones aprendidas tras interactuar con agencias de homologación vial."); a3_3.setNivelCapacidadEsperado(5); a3_3.setCalificacionActual("N");
        pract03.setActividades(Arrays.asList(a3_1, a3_2, a3_3));

        // Práctica 4
        PracticaCobit pract04 = new PracticaCobit();
        pract04.setComponente(compA);
        pract04.setIdPractica("MEA03.04");
        pract04.setNombrePractica("Obtener aseguramiento de cumplimiento externo");
        pract04.setDescripcionPractica("Obtener certificaciones oficiales de auditores independientes y exigir evidencias de cumplimiento a los proveedores de la cadena de suministro tecnológica.");
        Actividad a4_1 = new Actividad(); a4_1.setPractica(pract04); a4_1.setDescripcionActividad("Realizar periódicamente revisiones externas independientes para obtener la recertificación de ciberseguridad sobre el clúster de actualizaciones OTA."); a4_1.setNivelCapacidadEsperado(2); a4_1.setCalificacionActual("N");
        Actividad a4_2 = new Actividad(); a4_2.setPractica(pract04); a4_2.setDescripcionActividad("Obtener declaraciones formales de los proveedores de servicios Cloud (AWS) sobre su cumplimiento con las leyes de privacidad internacionales."); a4_2.setNivelCapacidadEsperado(3); a4_2.setCalificacionActual("N");
        Actividad a4_3 = new Actividad(); a4_3.setPractica(pract04); a4_3.setDescripcionActividad("Supervisar y comunicar de forma transparente los problemas de incumplimiento al consejo de administración, implementando acciones correctivas inmediatas."); a4_3.setNivelCapacidadEsperado(4); a4_3.setCalificacionActual("N");
        pract04.setActividades(Arrays.asList(a4_1, a4_2, a4_3));

        compA.setPracticas(Arrays.asList(pract01, pract02, pract03, pract04));
        mea03.setComponenteA_Procesos(Arrays.asList(compA));

        // ==========================================
        // COMPONENTE B: ESTRUCTURAS ORGANIZATIVAS
        // ==========================================
        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(mea03); raci1.setPracticaGestion("MEA03.01"); raci1.setRolOrganizacional("Asesor legal / Departamento de Cumplimiento"); raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(mea03); raci2.setPracticaGestion("MEA03.02"); raci2.setRolOrganizacional("Departamento de Cumplimiento"); raci2.setNivelResponsabilidad("A");
        MatrizRaci raci3 = new MatrizRaci(); raci3.setProceso(mea03); raci3.setPracticaGestion("MEA03.04"); raci3.setRolOrganizacional("Auditoría"); raci3.setNivelResponsabilidad("A");
        mea03.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3));

        // ==========================================
        // COMPONENTE C: FLUJOS DE INFORMACIÓN
        // ==========================================
        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(mea03); flujo1.setPracticaGestion("MEA03.01"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: Entorno Externo / Reguladores"); flujo1.setDescripcion("Requisitos de cumplimiento legal y regulatorio internacional (normativas automotrices).");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(mea03); flujo2.setPracticaGestion("MEA03.04"); flujo2.setTipoFlujo("SALIDA"); flujo2.setOrigenDestino("A: EDM01.03"); flujo2.setDescripcion("Informes de aseguramiento de cumplimiento para el Consejo de Gobierno.");
        mea03.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2));

        // ==========================================
        // COMPONENTE D: HABILIDADES PROFESIONALES
        // ==========================================
        Habilidad hab1 = new Habilidad(); hab1.setProceso(mea03); hab1.setNombreHabilidad("Seguridad de la información y Legislación Internacional"); hab1.setDocumentacionRelacionada("Skills Framework for the Information Age V6, 2015"); hab1.setReferenciaEspecifica("Identificador: SCTY. Capacidad para interpretar normativas complejas e inyectarlas en el diseño de software crítico.");
        mea03.setComponenteD_Habilidades(Arrays.asList(hab1));

        // ==========================================
        // COMPONENTE E: POLÍTICAS INSTITUCIONALES
        // ==========================================
        Politica pol1 = new Politica(); pol1.setProceso(mea03); pol1.setTituloPolitica("Política de cumplimiento regulatorio y legal"); pol1.setDescripcionPolitica("Identifica los requisitos de cumplimiento de los organismos reguladores del transporte global. Explica el proceso riguroso para evaluar que todo software instalado remotamente en el vehículo no viole las normativas de seguridad de los pasajeros ni los derechos de privacidad del conductor."); pol1.setDocumentacionRelacionada("Estatutos corporativos de Homologación de Software"); pol1.setReferenciaEspecifica("Garantiza la obtención formal de los informes de cumplimiento de auditorías externas antes de cualquier liberación (release) importante.");
        mea03.setComponenteE_Politicas(Arrays.asList(pol1));

        // ==========================================
        // COMPONENTE F: CULTURA DE TRABAJO
        // ==========================================
        Cultura cult1 = new Cultura(); cult1.setProceso(mea03); cult1.setElementoCultural("Cultura de Tolerancia Cero al Incumplimiento"); cult1.setDocumentacionRelacionada("Código de Ética e Integridad Tecnológica"); cult1.setReferenciaEspecifica("Proporcionar una cultura de concienciación donde los desarrolladores e ingenieros entiendan que el incumplimiento normativo en vehículos puede derivar en accidentes o multas corporativas masivas. Tolerancia cero ante atajos que vulneren regulaciones.");
        mea03.setComponenteF_Cultura(Arrays.asList(cult1));

        // ==========================================
        // COMPONENTE G: SERVICIOS Y HERRAMIENTAS
        // ==========================================
        Servicio serv1 = new Servicio(); serv1.setProceso(mea03); serv1.setNombreServicioHerramienta("Servicios de vigilancia regulatoria automatizada (Legal Tech)");
        Servicio serv2 = new Servicio(); serv2.setProceso(mea03); serv2.setNombreServicioHerramienta("Servicios de evaluación y certificación al cumplimiento de terceros");
        mea03.setComponenteG_Servicios(Arrays.asList(serv1, serv2));

        procesoRepository.save(mea03);
    }
}