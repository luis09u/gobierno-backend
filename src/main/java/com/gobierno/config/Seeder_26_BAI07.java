package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Order(26)
public class Seeder_26_BAI07 implements CommandLineRunner {

    private final ProcesoCobitRepository procesoRepository;

    public Seeder_26_BAI07(ProcesoCobitRepository procesoRepository) {
        this.procesoRepository = procesoRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (!procesoRepository.existsById("BAI07")) {
            cargarBAI07();
        }
    }

    private void cargarBAI07() {
        ProcesoCobit bai07 = new ProcesoCobit();
        bai07.setIdProceso("BAI07");
        bai07.setDominio("Construir, Adquirir e Implementar");
        bai07.setAreaPrioritaria("Modelo Core de COBIT");
        bai07.setNombreProceso("Gestionar la aceptación y la transición de los cambios de TI");
        bai07.setDescripcionProceso("Aceptar formalmente y poner en funcionamiento las nuevas soluciones, incluyendo la planificación de la implementación, la conversión de sistemas y datos, las pruebas de aceptación, la comunicación, la preparación del lanzamiento, la producción, el soporte temprano y la revisión posterior a la implementación.");
        bai07.setPropositoProceso("Garantizar que la implementación de nuevas funcionalidades en los automóviles conectados no se realice de manera unilateral por el equipo de ingeniería, sino que cuente con la validación explícita y formal de las áreas comerciales, mitigando el riesgo de rechazo operativo por parte del consumidor final.");

        bai07.setMetasAlineamiento("AG08: Habilitación y soporte de procesos de negocio mediante la integración de aplicaciones y tecnología.\nAG09: Entrega de programas que proporcionen beneficios a tiempo, dentro del presupuesto y cumpliendo los requisitos y estándares de calidad.");
        bai07.setMetasEmpresariales("EG01: Portafolio de productos y servicios competitivos.\nEG06: Continuidad y disponibilidad del servicio de negocio.");
        bai07.setMetricasModelo("Métrica 1: Número de interrupciones o errores debidos a transiciones o conversiones de datos deficientes.\nMétrica 2: Nivel de satisfacción de los usuarios respecto a los nuevos servicios implementados.");

        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(bai07);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("BAI07.01");
        pract01.setNombrePractica("Establecer un plan de implementación");
        pract01.setDescripcionPractica("Establecer un plan de implementación y transición que soporte el despliegue de las nuevas soluciones y servicios.");
        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Definir una estrategia para el despliegue de soluciones, evaluando el impacto operativo y planificando medidas para mitigarlo."); a1_1.setNivelCapacidadEsperado(2); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Elaborar un plan de implementación detallado, incluyendo procedimientos de respaldo y opciones alternativas si falla el despliegue."); a1_2.setNivelCapacidadEsperado(3); a1_2.setCalificacionActual("N");
        Actividad a1_3 = new Actividad(); a1_3.setPractica(pract01); a1_3.setDescripcionActividad("Definir las responsabilidades y coordinar los recursos humanos, de infraestructura y de operaciones de TI requeridos."); a1_3.setNivelCapacidadEsperado(3); a1_3.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2, a1_3));

        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("BAI07.05");
        pract02.setNombrePractica("Realizar pruebas de aceptación");
        pract02.setDescripcionPractica("Realizar pruebas exhaustivas en entornos lo más reales posibles para verificar que las soluciones cumplen con los requisitos de negocio y las especificaciones técnicas.");
        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Establecer un entorno de prueba representativo del entorno de producción y mantener los datos de prueba de forma segura."); a2_1.setNivelCapacidadEsperado(2); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Planificar y ejecutar pruebas integrales y de aceptación por el usuario (UAT) en coordinación con los responsables del negocio."); a2_2.setNivelCapacidadEsperado(3); a2_2.setCalificacionActual("N");
        Actividad a2_3 = new Actividad(); a2_3.setPractica(pract02); a2_3.setDescripcionActividad("Registrar, analizar y resolver sistemáticamente todos los defectos, errores o problemas identificados durante la fase de prueba."); a2_3.setNivelCapacidadEsperado(4); a2_3.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2, a2_3));

        PracticaCobit pract03 = new PracticaCobit();
        pract03.setComponente(compA);
        pract03.setIdPractica("BAI07.07");
        pract03.setNombrePractica("Proporcionar apoyo temprano a la producción y transicionar hacia operaciones");
        pract03.setDescripcionPractica("Brindar soporte especializado durante el período inicial tras el lanzamiento y realizar un traspaso documentado hacia el equipo de soporte habitual.");
        Actividad a3_1 = new Actividad(); a3_1.setPractica(pract03); a3_1.setDescripcionActividad("Proporcionar recursos adicionales o soporte temprano (hypercare) para resolver incidencias rápidamente tras el despliegue."); a3_1.setNivelCapacidadEsperado(2); a3_1.setCalificacionActual("N");
        Actividad a3_2 = new Actividad(); a3_2.setPractica(pract03); a3_2.setDescripcionActividad("Transferir formalmente el conocimiento y la responsabilidad operativa y de soporte técnico del equipo del proyecto a la función de operaciones y atención al usuario (Service Desk)."); a3_2.setNivelCapacidadEsperado(3); a3_2.setCalificacionActual("N");
        Actividad a3_3 = new Actividad(); a3_3.setPractica(pract03); a3_3.setDescripcionActividad("Acordar, medir y notificar formalmente si se han alcanzado los criterios de éxito del lanzamiento antes del cierre del proyecto de transición."); a3_3.setNivelCapacidadEsperado(4); a3_3.setCalificacionActual("N");
        pract03.setActividades(Arrays.asList(a3_1, a3_2, a3_3));

        compA.setPracticas(Arrays.asList(pract01, pract02, pract03));
        bai07.setComponenteA_Procesos(Arrays.asList(compA));

        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(bai07); raci1.setPracticaGestion("BAI07.01"); raci1.setRolOrganizacional("Gestor Principal de Despliegue y Transición"); raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(bai07); raci2.setPracticaGestion("BAI07.05"); raci2.setRolOrganizacional("Directores de Unidades Comerciales"); raci2.setNivelResponsabilidad("R");
        MatrizRaci raci3 = new MatrizRaci(); raci3.setProceso(bai07); raci3.setPracticaGestion("BAI07.07"); raci3.setRolOrganizacional("Comité Ejecutivo de Operaciones"); raci3.setNivelResponsabilidad("C");
        bai07.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3));

        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(bai07); flujo1.setPracticaGestion("BAI07.01"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: BAI06.03"); flujo1.setDescripcion("Autorizaciones oficiales del comité de cambios y programación de fechas operativas.");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(bai07); flujo2.setPracticaGestion("BAI07.07"); flujo2.setTipoFlujo("SALIDA"); flujo2.setOrigenDestino("A: DSS01.01"); flujo2.setDescripcion("Actas de aceptación comercial debidamente firmadas y traspaso formal de la responsabilidad operativa hacia las áreas de soporte continuo.");
        bai07.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2));

        Habilidad hab1 = new Habilidad(); hab1.setProceso(bai07); hab1.setNombreHabilidad("Evaluación de Calidad y Gestión de Pruebas Empresariales"); hab1.setDocumentacionRelacionada("Directrices del Comité Internacional de Calificación de Pruebas de Software"); hab1.setReferenciaEspecifica("De este estándar global se rescata de manera directa la metodología para diseñar escenarios de prueba objetivos que eliminen los sesgos técnicos, garantizando que el sistema sea evaluado bajo condiciones que replican con exactitud el comportamiento impredecible del consumidor real.");
        bai07.setComponenteD_Habilidades(Arrays.asList(hab1));

        Politica pol1 = new Politica(); pol1.setProceso(bai07); pol1.setTituloPolitica("Directiva General de Aceptación Comercial y Corresponsabilidad Operativa"); pol1.setDescripcionPolitica("Normativa institucional irrevocable que prohíbe terminantemente la transferencia de cualquier sistema tecnológico hacia el entorno público sin contar con un acta de conformidad firmada por el director comercial afectado. Esta política anula cualquier presión gerencial por cumplir fechas de lanzamiento si el producto no ha demostrado solvencia operativa en los entornos de simulación."); pol1.setDocumentacionRelacionada("Estatuto de Gobernanza Tecnológica Corporativa"); pol1.setReferenciaEspecifica("Sección: Criterios Finales de Integración Comercial");
        bai07.setComponenteE_Politicas(Arrays.asList(pol1));

        Cultura cult1 = new Cultura(); cult1.setProceso(bai07); cult1.setElementoCultural("Cultura de Corresponsabilidad y Verificación Exhaustiva"); cult1.setDocumentacionRelacionada("Manifiesto de Integridad Organizacional"); cult1.setReferenciaEspecifica("Consolidar en la mente directiva el principio de que los errores descubiertos durante la fase de aceptación son victorias preventivas de la empresa y no fracasos del equipo técnico, fomentando un ambiente donde reportar defectos antes del despliegue comercial sea celebrado y recompensado institucionalmente.");
        bai07.setComponenteF_Cultura(Arrays.asList(cult1));

        Servicio serv1 = new Servicio(); serv1.setProceso(bai07); serv1.setNombreServicioHerramienta("Entornos Informáticos de Preproducción Segregados y Simuladores de Conducta de Usuario");
        Servicio serv2 = new Servicio(); serv2.setProceso(bai07); serv2.setNombreServicioHerramienta("Plataformas Digitales para la Trazabilidad y Gestión Centralizada de Defectos Reportados");
        bai07.setComponenteG_Servicios(Arrays.asList(serv1, serv2));

        procesoRepository.save(bai07);
    }
}