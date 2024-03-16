package net.mcreator.hellscraft.client.model;

import org.objectweb.asm.Handle;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelLavaAxeProj_Converted<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("hellscraft", "model_lava_axe_proj_converted"), "main");
	public final ModelPart Handle;
	public final ModelPart Blade;

	public ModelLavaAxeProj_Converted(ModelPart root) {
		this.Handle = root.getChild("Handle");
		this.Blade = root.getChild("Blade");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Handle = partdefinition.addOrReplaceChild("Handle", CubeListBuilder.create(), PartPose.offset(8.0F, 24.0F, -8.0F));
		PartDefinition cube_r1 = Handle.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(12, 7).addBox(-1.0F, -12.0F, -8.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 7).addBox(-2.0F, -11.0F, -8.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 7)
						.addBox(1.0F, -10.0F, -8.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 7).addBox(0.0F, -9.0F, -8.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 7)
						.addBox(2.0F, -7.0F, -8.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 7).addBox(3.0F, -8.0F, -8.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 7)
						.addBox(-3.0F, -13.0F, -8.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 10).addBox(-1.0F, -11.0F, -8.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 4)
						.addBox(1.0F, -9.0F, -8.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 10).addBox(3.0F, -7.0F, -8.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, -0.7854F));
		PartDefinition Blade = partdefinition.addOrReplaceChild("Blade", CubeListBuilder.create(), PartPose.offset(0.0F, 16.0F, 0.0F));
		PartDefinition cube_r2 = Blade.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(4, 13).addBox(-4.0F, -13.0F, -8.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 7).addBox(-6.0F, -13.0F, -8.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 12)
						.addBox(-7.0F, -14.0F, -8.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 9).addBox(-4.0F, -19.0F, -8.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 0)
						.addBox(-1.0F, -17.0F, -8.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 13).addBox(0.0F, -16.0F, -8.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 4)
						.addBox(-5.0F, -18.0F, -8.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-6.0F, -16.0F, -8.5F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, 8.0F, -8.0F, 0.0F, 3.1416F, -0.7854F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Handle.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Blade.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
