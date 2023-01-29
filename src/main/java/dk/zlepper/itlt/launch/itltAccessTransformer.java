package dk.zlepper.itlt.launch;

import java.io.IOException;

import cpw.mods.fml.common.asm.transformers.AccessTransformer;

public class itltAccessTransformer extends AccessTransformer {

    public itltAccessTransformer() throws IOException {
        super("itlt_at.cfg");
    }
}
