package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Order(17) // Continuidad secuencial estricta en el sistema de carga
public class Seeder_17_APO12 implements CommandLineRunner {

    private final ProcesoCobitRepository procesoRepository;

    public Seeder_17_APO12(ProcesoCobitRepository procesoRepository) {
        this.procesoRepository = procesoRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (!procesoRepository.existsById("APO12")) {
            System.out.println("Iniciando carga de datos de gestión del riesgo corporativo: APO12...");
            cargarAPO12();
            System.out.println("APO12 (Gestión del Riesgo) cargado exitosamente.");
        }
    }

    private void cargarAPO12() {
        // ==========================================
        // INFORMACIÓN GENERAL (LENGUAJE GERENCIAL Y DIRECTIVO)
        // ==========================================
        ProcesoCobit apo12 = new ProcesoCobit();
        apo12.setIdProceso("APO12");
        apo12.setDominio("Alinear, Planificar y Organizar");
        apo12.setAreaPrioritaria("Modelo Core de COBIT");
        apo12.setNombreProceso("Gestionar el riesgo");
        apo12.setDescripcionProceso("Identificar, evaluar y mitigar de forma constante los riesgos relacionados con la tecnología de la información para proteger el valor de la empresa. Asegurar que el perfil de riesgo tecnológico de la organización esté alineado con el nivel de tolerancia definido por la alta dirección.");
        apo12.setPropositoProceso("Establecer un marco operativo que permita predecir y neutralizar las amenazas asociadas a las actualizaciones inalámbricas a distancia y el procesamiento de datos vehiculares, resguardando la integridad física de los conductores y el cumplimiento normativo global.");

        apo12.setMetasAlineamiento("AG02: Gestión integral de los riesgos de seguridad asociados a la tecnología de la información.\nAG07: Seguridad, confiabilidad e integridad de la infraestructura de procesamiento de datos institucional.");
        apo12.setMetasEmpresariales("EG03: Cumplimiento estricto de las leyes, normativas y regulaciones externas aplicables al sector.\nEG06: Continuidad del negocio y alta disponibilidad de los servicios comerciales.");
        apo12.setMetricasModelo("Métrica 1: Número de eventos de riesgo tecnológico críticos no identificados previamente en el mapa de calor anual.\nMétrica 2: Tiempo promedio requerido por la organización para ejecutar planes de contingencia ante brechas operativas detectadas.");

        // ==========================================
        // COMPONENTE A: PRÁCTICAS Y ACTIVIDADES DE MITIGACIÓN
        // ==========================================
        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(apo12);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("APO12.01");
        pract01.setNombrePractica("Recopilar datos y definir el perfil de riesgo");
        pract01.setDescripcionPractica("Establecer los mecanismos para registrar debilidades del entorno técnico y mantener actualizado el inventario de amenazas de la organización.");
        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Documentar las fallas operativas históricas en la transmisión a distancia de datos para definir los límites de tolerancia aceptables por el negocio."); a1_1.setNivelCapacidadEsperado(2); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Diseñar y difundir un formato institucional para que cualquier área de la empresa pueda reportar posibles incidentes tecnológicos."); a1_2.setNivelCapacidadEsperado(3); a1_2.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2));

        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("APO12.02");
        pract02.setNombrePractica("Analizar y evaluar el impacto del riesgo");
        pract02.setDescripcionPractica("Estimar la probabilidad de ocurrencia de los escenarios negativos y calcular la pérdida económica o el daño reputacional que ocasionarían a la empresa.");
        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Desarrollar un análisis financiero sobre las penalidades legales e indemnizaciones derivadas de una eventual interrupción masiva en el sistema de los vehículos."); a2_1.setNivelCapacidadEsperado(3); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Elaborar y actualizar el mapa de calor institucional que califique los riesgos de infraestructura tecnológica según su gravedad estratégica."); a2_2.setNivelCapacidadEsperado(4); a2_2.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2));

        PracticaCobit pract03 = new PracticaCobit();
        pract03.setComponente(compA);
        pract03.setIdPractica("APO12.03");
        pract03.setNombrePractica("Definir la respuesta y los planes de mitigación");
        pract03.setDescripcionPractica("Diseñar los controles preventivos y las acciones de contingencia inmediatas para reaccionar ante la materialización de una crisis.");
        Actividad a3_1 = new Actividad(); a3_1.setPractica(pract03); a3_1.setDescripcionActividad("Establecer un protocolo de interrupción de emergencia que detenga de inmediato cualquier envío de software si se detecta una anomalía en las líneas de transmisión."); a3_1.setNivelCapacidadEsperado(4); a3_1.setCalificacionActual("N");
        Actividad a3_2 = new Actividad(); a3_2.setPractica(pract03); a3_2.setDescripcionActividad("Asignar responsabilidades presupuestarias y operativas concretas a los líderes de área para la ejecución de los planes de recuperación de datos."); a3_2.setNivelCapacidadEsperado(3); a3_2.setCalificacionActual("N");
        pract03.setActividades(Arrays.asList(a3_1, a3_2));

        compA.setPracticas(Arrays.asList(pract01, pract02, pract03));
        apo12.setComponenteA_Procesos(Arrays.asList(compA));

        // ==========================================
        // COMPONENTE B: ESTRUCTURAS ORGANIZATIVAS (ROLES DE GOBIERNO)
        // ==========================================
        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(apo12); raci1.setPracticaGestion("APO12.01"); raci1.setRolOrganizacional("Comité de Riesgos y Cumplimiento");  raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(apo12); raci2.setPracticaGestion("APO12.02"); raci2.setRolOrganizacional("Director de Seguridad de la Información"); raci2.setNivelResponsabilidad("R");
        MatrizRaci raci3 = new MatrizRaci(); raci3.setProceso(apo12); raci3.setPracticaGestion("APO12.03"); raci3.setRolOrganizacional("Directores Generales de Unidades de Negocio");  raci3.setNivelResponsabilidad("C");

        apo12.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3));

        // ==========================================
        // COMPONENTE C: FLUJOS DE INFORMACIÓN
        // ==========================================
        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(apo12); flujo1.setPracticaGestion("APO12.02"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: EDM03.01"); flujo1.setDescripcion("Límites de apetito de riesgo y nivel de tolerancia aprobados por el directorio.");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(apo12); flujo2.setPracticaGestion("APO12.03"); flujo2.setTipoFlujo("SALIDA"); flujo2.setOrigenDestino("A: Todos los procesos operativos"); flujo2.setDescripcion("Planes de acción ante contingencias, asignación de responsabilidades y controles preventivos mandatorios.");

        apo12.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2));

        // ==========================================
        // COMPONENTE D: HABILIDADES PROFESIONALES
        // ==========================================
        Habilidad hab1 = new Habilidad(); hab1.setProceso(apo12); hab1.setNombreHabilidad("Evaluación y Gobierno del Riesgo Corporativo"); hab1.setDocumentacionRelacionada("Estándares Internacionales de Control Interno (ISO 31000 / COSO)"); hab1.setReferenciaEspecifica("Identificación prospectiva de escenarios críticos, modelado de impactos económicos y diseño de políticas de control preventivo.");

        apo12.setComponenteD_Habilidades(Arrays.asList(hab1));

        // ==========================================
        // COMPONENTE E: POLÍTICAS INSTITUCIONALES
        // ==========================================
        Politica pol1 = new Politica(); pol1.setProceso(apo12); pol1.setTituloPolitica("Estatuto Corporativo para la Gestión de Riesgos e Integridad Tecnológica"); pol1.setDescripcionPolitica("Normativa general que dictamina la obligatoriedad de evaluar el impacto normativo, comercial y de seguridad humana de todo cambio tecnológico sustancial antes de su implementación en los sistemas centrales, prohibiendo la omisión de controles por razones de celeridad de mercado."); pol1.setDocumentacionRelacionada("Manual de Control y Gobierno Institucional"); pol1.setReferenciaEspecifica("Sección: Prevención de Pérdidas y Control Operativo");

        apo12.setComponenteE_Politicas(Arrays.asList(pol1));

        // ==========================================
        // COMPONENTE F: CULTURA DE PREVENCIÓN
        // ==========================================
        Cultura cult1 = new Cultura(); cult1.setProceso(apo12); cult1.setElementoCultural("Cultura de Responsabilidad Proactiva ante el Riesgo"); cult1.setDocumentacionRelacionada("Código de Ética y Gestión de Operaciones"); cult1.setReferenciaEspecifica("Fomentar de manera permanente una conducta transparente donde los colaboradores informen sobre anomalías o riesgos latentes en el código de manera proactiva, priorizando la seguridad y la reputación a largo plazo de la organización.");

        apo12.setComponenteF_Cultura(Arrays.asList(cult1));

        // ==========================================
        // COMPONENTE G: SERVICIOS Y HERRAMIENTAS
        // ==========================================
        Servicio serv1 = new Servicio(); serv1.setProceso(apo12); serv1.setNombreServicioHerramienta("Sistemas Corporativos Integrados de Control Interno y Mapas de Riesgo Automatizados");
        Servicio serv2 = new Servicio(); serv2.setProceso(apo12); serv2.setNombreServicioHerramienta("Plataformas de Monitoreo Analítico para la Detección Temprana de Incidentes Operativos");

        apo12.setComponenteG_Servicios(Arrays.asList(serv1, serv2));

        procesoRepository.save(apo12);
    }
}