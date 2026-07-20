package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Order(17)
public class Seeder_17_APO12 implements CommandLineRunner {

    private final ProcesoCobitRepository procesoRepository;

    public Seeder_17_APO12(ProcesoCobitRepository procesoRepository) {
        this.procesoRepository = procesoRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (!procesoRepository.existsById("APO12")) {
            cargarAPO12();
        }
    }

    private void cargarAPO12() {
        ProcesoCobit apo12 = new ProcesoCobit();
        apo12.setIdProceso("APO12");
        apo12.setDominio("Alinear, Planificar y Organizar");
        apo12.setAreaPrioritaria("Modelo Core de COBIT");
        apo12.setNombreProceso("Gestionar el riesgo");
        apo12.setDescripcionProceso("Identificar, evaluar y reducir continuamente los riesgos relacionados con I&T dentro de los niveles de tolerancia establecidos por la dirección ejecutiva de la empresa.");
        apo12.setPropositoProceso("Establecer un marco operativo que permita predecir y neutralizar las amenazas asociadas a las actualizaciones inalámbricas a distancia y el procesamiento de datos vehiculares, resguardando la integridad física de los conductores y el cumplimiento normativo global.");

        apo12.setMetasAlineamiento("AG02: Gestión de riesgos relacionados con I&T.\nAG07: Seguridad de la información, infraestructura de procesamiento y de las aplicaciones.");
        apo12.setMetasEmpresariales("EG02: Riesgo de negocio gestionado.\nEG06: Continuidad y disponibilidad del servicio de negocio.");
        apo12.setMetricasModelo("Métrica 1: Porcentaje de riesgos críticos de I&T gestionados dentro de los niveles de tolerancia al riesgo.\nMétrica 2: Frecuencia de actualización del perfil de riesgo.");

        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(apo12);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("APO12.01");
        pract01.setNombrePractica("Recopilar datos");
        pract01.setDescripcionPractica("Identificar y recopilar datos relevantes para permitir la identificación, el análisis y el informe eficaces del riesgo relacionado con la I&T.");
        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Establecer y mantener un método para registrar de forma sistemática eventos de riesgo que causen o puedan causar impactos en el negocio."); a1_1.setNivelCapacidadEsperado(2); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Identificar y clasificar datos de eventos de riesgo y problemas de la industria o regulatorios, como incidentes, errores y fallos técnicos."); a1_2.setNivelCapacidadEsperado(3); a1_2.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2));

        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("APO12.02");
        pract02.setNombrePractica("Analizar el riesgo");
        pract02.setDescripcionPractica("Desarrollar una información basada en hechos sobre los riesgos de I&T y consolidar estos en perfiles de riesgo y escenarios viables.");
        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Definir los escenarios de riesgo de TI relevantes, y documentar el impacto en el negocio (financiero, reputacional, legal)."); a2_1.setNivelCapacidadEsperado(3); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Estimar la probabilidad y el impacto de eventos de riesgo basándose en el análisis de datos."); a2_2.setNivelCapacidadEsperado(3); a2_2.setCalificacionActual("N");
        Actividad a2_3 = new Actividad(); a2_3.setPractica(pract02); a2_3.setDescripcionActividad("Comparar el riesgo actual con la tolerancia al riesgo aceptable y proponer medidas en consecuencia."); a2_3.setNivelCapacidadEsperado(4); a2_3.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2, a2_3));

        PracticaCobit pract03 = new PracticaCobit();
        pract03.setComponente(compA);
        pract03.setIdPractica("APO12.04");
        pract03.setNombrePractica("Articular el riesgo");
        pract03.setDescripcionPractica("Informar del riesgo a los niveles directivos y ejecutivos de forma que les permita tomar decisiones basándose en la información.");
        Actividad a3_1 = new Actividad(); a3_1.setPractica(pract03); a3_1.setDescripcionActividad("Informar el estado actual del perfil de riesgo de forma oportuna a todos los actores interesados relevantes."); a3_1.setNivelCapacidadEsperado(3); a3_1.setCalificacionActual("N");
        Actividad a3_2 = new Actividad(); a3_2.setPractica(pract03); a3_2.setDescripcionActividad("Presentar a la dirección los resultados del análisis de riesgos para apoyar la toma de decisiones relativas a la aceptación o mitigación de riesgos."); a3_2.setNivelCapacidadEsperado(4); a3_2.setCalificacionActual("N");
        pract03.setActividades(Arrays.asList(a3_1, a3_2));

        compA.setPracticas(Arrays.asList(pract01, pract02, pract03));
        apo12.setComponenteA_Procesos(Arrays.asList(compA));

        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(apo12); raci1.setPracticaGestion("APO12.01"); raci1.setRolOrganizacional("Comité de Riesgos y Cumplimiento");  raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(apo12); raci2.setPracticaGestion("APO12.02"); raci2.setRolOrganizacional("Director de Seguridad de la Información"); raci2.setNivelResponsabilidad("R");
        MatrizRaci raci3 = new MatrizRaci(); raci3.setProceso(apo12); raci3.setPracticaGestion("APO12.04"); raci3.setRolOrganizacional("Directores Generales de Unidades de Negocio");  raci3.setNivelResponsabilidad("C");
        apo12.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3));

        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(apo12); flujo1.setPracticaGestion("APO12.02"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: EDM03.01"); flujo1.setDescripcion("Límites de apetito de riesgo y nivel de tolerancia aprobados por el directorio.");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(apo12); flujo2.setPracticaGestion("APO12.04"); flujo2.setTipoFlujo("SALIDA"); flujo2.setOrigenDestino("A: Todos los procesos operativos"); flujo2.setDescripcion("Planes de acción ante contingencias, asignación de responsabilidades y controles preventivos mandatorios.");
        apo12.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2));

        Habilidad hab1 = new Habilidad(); hab1.setProceso(apo12); hab1.setNombreHabilidad("Evaluación y Gobierno del Riesgo Corporativo"); hab1.setDocumentacionRelacionada("Estándares Internacionales de Control Interno (ISO 31000 / COSO)"); hab1.setReferenciaEspecifica("Identificación prospectiva de escenarios críticos, modelado de impactos económicos y diseño de políticas de control preventivo.");
        apo12.setComponenteD_Habilidades(Arrays.asList(hab1));

        Politica pol1 = new Politica(); pol1.setProceso(apo12); pol1.setTituloPolitica("Estatuto Corporativo para la Gestión de Riesgos e Integridad Tecnológica"); pol1.setDescripcionPolitica("Normativa general que dictamina la obligatoriedad de evaluar el impacto normativo, comercial y de seguridad humana de todo cambio tecnológico sustancial antes de su implementación en los sistemas centrales, prohibiendo la omisión de controles por razones de celeridad de mercado."); pol1.setDocumentacionRelacionada("Manual de Control y Gobierno Institucional"); pol1.setReferenciaEspecifica("Sección: Prevención de Pérdidas y Control Operativo");
        apo12.setComponenteE_Politicas(Arrays.asList(pol1));

        Cultura cult1 = new Cultura(); cult1.setProceso(apo12); cult1.setElementoCultural("Cultura de Responsabilidad Proactiva ante el Riesgo"); cult1.setDocumentacionRelacionada("Código de Ética y Gestión de Operaciones"); cult1.setReferenciaEspecifica("Fomentar de manera permanente una conducta transparente donde los colaboradores informen sobre anomalías o riesgos latentes en el código de manera proactiva, priorizando la seguridad y la reputación a largo plazo de la organización.");
        apo12.setComponenteF_Cultura(Arrays.asList(cult1));

        Servicio serv1 = new Servicio(); serv1.setProceso(apo12); serv1.setNombreServicioHerramienta("Sistemas Corporativos Integrados de Control Interno y Mapas de Riesgo Automatizados");
        Servicio serv2 = new Servicio(); serv2.setProceso(apo12); serv2.setNombreServicioHerramienta("Plataformas de Monitoreo Analítico para la Detección Temprana de Incidentes Operativos");
        apo12.setComponenteG_Servicios(Arrays.asList(serv1, serv2));

        procesoRepository.save(apo12);
    }
}