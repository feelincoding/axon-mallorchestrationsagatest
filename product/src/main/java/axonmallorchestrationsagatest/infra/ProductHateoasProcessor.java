package axonmallorchestrationsagatest.infra;

import axonmallorchestrationsagatest.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class ProductHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Product>> {

    @Override
    public EntityModel<Product> process(EntityModel<Product> model) {
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/decreasestock")
                .withRel("decreasestock")
        );
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/increasestock")
                .withRel("increasestock")
        );

        return model;
    }
}
