package dev.lpsmods.morepumpkins.core;

import dev.lpsmods.morepumpkins.Constants;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

/**
* Author: legopitstop
*/
public class ModItems {
    // Soul Jack o' Lantern
    public static final Item SOUL_JACK_O_LANTERN;
    public static final Item CREEPER_SOUL_JACK_O_LANTERN;
    public static final Item FLOWER_SOUL_JACK_O_LANTERN;
    public static final Item GHAST_SOUL_JACK_O_LANTERN;
    public static final Item GLOBE_SOUL_JACK_O_LANTERN;
    public static final Item OBSERVER_SOUL_JACK_O_LANTERN;
    public static final Item SKELETON_SOUL_JACK_O_LANTERN;
    public static final Item SNOUT_SOUL_JACK_O_LANTERN;
    public static final Item ZERO_SOUL_JACK_O_LANTERN;
    public static final Item ONE_SOUL_JACK_O_LANTERN;
    public static final Item TWO_SOUL_JACK_O_LANTERN;
    public static final Item THREE_SOUL_JACK_O_LANTERN;
    public static final Item FOUR_SOUL_JACK_O_LANTERN;
    public static final Item FIVE_SOUL_JACK_O_LANTERN;
    public static final Item SIX_SOUL_JACK_O_LANTERN;
    public static final Item SEVEN_SOUL_JACK_O_LANTERN;
    public static final Item EIGHT_SOUL_JACK_O_LANTERN;
    public static final Item NINE_SOUL_JACK_O_LANTERN;
    public static final Item LOWERCASE_A_SOUL_JACK_O_LANTERN;
    public static final Item LOWERCASE_B_SOUL_JACK_O_LANTERN;
    public static final Item LOWERCASE_C_SOUL_JACK_O_LANTERN;
    public static final Item LOWERCASE_D_SOUL_JACK_O_LANTERN;
    public static final Item LOWERCASE_E_SOUL_JACK_O_LANTERN;
    public static final Item LOWERCASE_F_SOUL_JACK_O_LANTERN;
    public static final Item LOWERCASE_G_SOUL_JACK_O_LANTERN;
    public static final Item LOWERCASE_H_SOUL_JACK_O_LANTERN;
    public static final Item LOWERCASE_I_SOUL_JACK_O_LANTERN;
    public static final Item LOWERCASE_J_SOUL_JACK_O_LANTERN;
    public static final Item LOWERCASE_K_SOUL_JACK_O_LANTERN;
    public static final Item LOWERCASE_L_SOUL_JACK_O_LANTERN;
    public static final Item LOWERCASE_M_SOUL_JACK_O_LANTERN;
    public static final Item LOWERCASE_N_SOUL_JACK_O_LANTERN;
    public static final Item LOWERCASE_O_SOUL_JACK_O_LANTERN;
    public static final Item LOWERCASE_P_SOUL_JACK_O_LANTERN;
    public static final Item LOWERCASE_Q_SOUL_JACK_O_LANTERN;
    public static final Item LOWERCASE_R_SOUL_JACK_O_LANTERN;
    public static final Item LOWERCASE_S_SOUL_JACK_O_LANTERN;
    public static final Item LOWERCASE_T_SOUL_JACK_O_LANTERN;
    public static final Item LOWERCASE_U_SOUL_JACK_O_LANTERN;
    public static final Item LOWERCASE_V_SOUL_JACK_O_LANTERN;
    public static final Item LOWERCASE_W_SOUL_JACK_O_LANTERN;
    public static final Item LOWERCASE_X_SOUL_JACK_O_LANTERN;
    public static final Item LOWERCASE_Y_SOUL_JACK_O_LANTERN;
    public static final Item LOWERCASE_Z_SOUL_JACK_O_LANTERN;
    public static final Item UPPERCASE_A_SOUL_JACK_O_LANTERN;
    public static final Item UPPERCASE_B_SOUL_JACK_O_LANTERN;
    public static final Item UPPERCASE_C_SOUL_JACK_O_LANTERN;
    public static final Item UPPERCASE_D_SOUL_JACK_O_LANTERN;
    public static final Item UPPERCASE_E_SOUL_JACK_O_LANTERN;
    public static final Item UPPERCASE_F_SOUL_JACK_O_LANTERN;
    public static final Item UPPERCASE_G_SOUL_JACK_O_LANTERN;
    public static final Item UPPERCASE_H_SOUL_JACK_O_LANTERN;
    public static final Item UPPERCASE_I_SOUL_JACK_O_LANTERN;
    public static final Item UPPERCASE_J_SOUL_JACK_O_LANTERN;
    public static final Item UPPERCASE_K_SOUL_JACK_O_LANTERN;
    public static final Item UPPERCASE_L_SOUL_JACK_O_LANTERN;
    public static final Item UPPERCASE_M_SOUL_JACK_O_LANTERN;
    public static final Item UPPERCASE_N_SOUL_JACK_O_LANTERN;
    public static final Item UPPERCASE_O_SOUL_JACK_O_LANTERN;
    public static final Item UPPERCASE_P_SOUL_JACK_O_LANTERN;
    public static final Item UPPERCASE_Q_SOUL_JACK_O_LANTERN;
    public static final Item UPPERCASE_R_SOUL_JACK_O_LANTERN;
    public static final Item UPPERCASE_S_SOUL_JACK_O_LANTERN;
    public static final Item UPPERCASE_T_SOUL_JACK_O_LANTERN;
    public static final Item UPPERCASE_U_SOUL_JACK_O_LANTERN;
    public static final Item UPPERCASE_V_SOUL_JACK_O_LANTERN;
    public static final Item UPPERCASE_W_SOUL_JACK_O_LANTERN;
    public static final Item UPPERCASE_X_SOUL_JACK_O_LANTERN;
    public static final Item UPPERCASE_Y_SOUL_JACK_O_LANTERN;
    public static final Item UPPERCASE_Z_SOUL_JACK_O_LANTERN;

    // Jack o' Lantern
    public static final Item CREEPER_JACK_O_LANTERN;
    public static final Item FLOWER_JACK_O_LANTERN;
    public static final Item GHAST_JACK_O_LANTERN;
    public static final Item GLOBE_JACK_O_LANTERN;
    public static final Item OBSERVER_JACK_O_LANTERN;
    public static final Item SKELETON_JACK_O_LANTERN;
    public static final Item SNOUT_JACK_O_LANTERN;
    public static final Item ZERO_JACK_O_LANTERN;
    public static final Item ONE_JACK_O_LANTERN;
    public static final Item TWO_JACK_O_LANTERN;
    public static final Item THREE_JACK_O_LANTERN;
    public static final Item FOUR_JACK_O_LANTERN;
    public static final Item FIVE_JACK_O_LANTERN;
    public static final Item SIX_JACK_O_LANTERN;
    public static final Item SEVEN_JACK_O_LANTERN;
    public static final Item EIGHT_JACK_O_LANTERN;
    public static final Item NINE_JACK_O_LANTERN;
    public static final Item LOWERCASE_A_JACK_O_LANTERN;
    public static final Item LOWERCASE_B_JACK_O_LANTERN;
    public static final Item LOWERCASE_C_JACK_O_LANTERN;
    public static final Item LOWERCASE_D_JACK_O_LANTERN;
    public static final Item LOWERCASE_E_JACK_O_LANTERN;
    public static final Item LOWERCASE_F_JACK_O_LANTERN;
    public static final Item LOWERCASE_G_JACK_O_LANTERN;
    public static final Item LOWERCASE_H_JACK_O_LANTERN;
    public static final Item LOWERCASE_I_JACK_O_LANTERN;
    public static final Item LOWERCASE_J_JACK_O_LANTERN;
    public static final Item LOWERCASE_K_JACK_O_LANTERN;
    public static final Item LOWERCASE_L_JACK_O_LANTERN;
    public static final Item LOWERCASE_M_JACK_O_LANTERN;
    public static final Item LOWERCASE_N_JACK_O_LANTERN;
    public static final Item LOWERCASE_O_JACK_O_LANTERN;
    public static final Item LOWERCASE_P_JACK_O_LANTERN;
    public static final Item LOWERCASE_Q_JACK_O_LANTERN;
    public static final Item LOWERCASE_R_JACK_O_LANTERN;
    public static final Item LOWERCASE_S_JACK_O_LANTERN;
    public static final Item LOWERCASE_T_JACK_O_LANTERN;
    public static final Item LOWERCASE_U_JACK_O_LANTERN;
    public static final Item LOWERCASE_V_JACK_O_LANTERN;
    public static final Item LOWERCASE_W_JACK_O_LANTERN;
    public static final Item LOWERCASE_X_JACK_O_LANTERN;
    public static final Item LOWERCASE_Y_JACK_O_LANTERN;
    public static final Item LOWERCASE_Z_JACK_O_LANTERN;
    public static final Item UPPERCASE_A_JACK_O_LANTERN;
    public static final Item UPPERCASE_B_JACK_O_LANTERN;
    public static final Item UPPERCASE_C_JACK_O_LANTERN;
    public static final Item UPPERCASE_D_JACK_O_LANTERN;
    public static final Item UPPERCASE_E_JACK_O_LANTERN;
    public static final Item UPPERCASE_F_JACK_O_LANTERN;
    public static final Item UPPERCASE_G_JACK_O_LANTERN;
    public static final Item UPPERCASE_H_JACK_O_LANTERN;
    public static final Item UPPERCASE_I_JACK_O_LANTERN;
    public static final Item UPPERCASE_J_JACK_O_LANTERN;
    public static final Item UPPERCASE_K_JACK_O_LANTERN;
    public static final Item UPPERCASE_L_JACK_O_LANTERN;
    public static final Item UPPERCASE_M_JACK_O_LANTERN;
    public static final Item UPPERCASE_N_JACK_O_LANTERN;
    public static final Item UPPERCASE_O_JACK_O_LANTERN;
    public static final Item UPPERCASE_P_JACK_O_LANTERN;
    public static final Item UPPERCASE_Q_JACK_O_LANTERN;
    public static final Item UPPERCASE_R_JACK_O_LANTERN;
    public static final Item UPPERCASE_S_JACK_O_LANTERN;
    public static final Item UPPERCASE_T_JACK_O_LANTERN;
    public static final Item UPPERCASE_U_JACK_O_LANTERN;
    public static final Item UPPERCASE_V_JACK_O_LANTERN;
    public static final Item UPPERCASE_W_JACK_O_LANTERN;
    public static final Item UPPERCASE_X_JACK_O_LANTERN;
    public static final Item UPPERCASE_Y_JACK_O_LANTERN;
    public static final Item UPPERCASE_Z_JACK_O_LANTERN;

    // Carved Pumpkin
    public static final Item CREEPER_CARVED_PUMPKIN;
    public static final Item FLOWER_CARVED_PUMPKIN;
    public static final Item GHAST_CARVED_PUMPKIN;
    public static final Item GLOBE_CARVED_PUMPKIN;
    public static final Item OBSERVER_CARVED_PUMPKIN;
    public static final Item SKELETON_CARVED_PUMPKIN;
    public static final Item SNOUT_CARVED_PUMPKIN;
    public static final Item ZERO_CARVED_PUMPKIN;
    public static final Item ONE_CARVED_PUMPKIN;
    public static final Item TWO_CARVED_PUMPKIN;
    public static final Item THREE_CARVED_PUMPKIN;
    public static final Item FOUR_CARVED_PUMPKIN;
    public static final Item FIVE_CARVED_PUMPKIN;
    public static final Item SIX_CARVED_PUMPKIN;
    public static final Item SEVEN_CARVED_PUMPKIN;
    public static final Item EIGHT_CARVED_PUMPKIN;
    public static final Item NINE_CARVED_PUMPKIN;
    public static final Item LOWERCASE_A_CARVED_PUMPKIN;
    public static final Item LOWERCASE_B_CARVED_PUMPKIN;
    public static final Item LOWERCASE_C_CARVED_PUMPKIN;
    public static final Item LOWERCASE_D_CARVED_PUMPKIN;
    public static final Item LOWERCASE_E_CARVED_PUMPKIN;
    public static final Item LOWERCASE_F_CARVED_PUMPKIN;
    public static final Item LOWERCASE_G_CARVED_PUMPKIN;
    public static final Item LOWERCASE_H_CARVED_PUMPKIN;
    public static final Item LOWERCASE_I_CARVED_PUMPKIN;
    public static final Item LOWERCASE_J_CARVED_PUMPKIN;
    public static final Item LOWERCASE_K_CARVED_PUMPKIN;
    public static final Item LOWERCASE_L_CARVED_PUMPKIN;
    public static final Item LOWERCASE_M_CARVED_PUMPKIN;
    public static final Item LOWERCASE_N_CARVED_PUMPKIN;
    public static final Item LOWERCASE_O_CARVED_PUMPKIN;
    public static final Item LOWERCASE_P_CARVED_PUMPKIN;
    public static final Item LOWERCASE_Q_CARVED_PUMPKIN;
    public static final Item LOWERCASE_R_CARVED_PUMPKIN;
    public static final Item LOWERCASE_S_CARVED_PUMPKIN;
    public static final Item LOWERCASE_T_CARVED_PUMPKIN;
    public static final Item LOWERCASE_U_CARVED_PUMPKIN;
    public static final Item LOWERCASE_V_CARVED_PUMPKIN;
    public static final Item LOWERCASE_W_CARVED_PUMPKIN;
    public static final Item LOWERCASE_X_CARVED_PUMPKIN;
    public static final Item LOWERCASE_Y_CARVED_PUMPKIN;
    public static final Item LOWERCASE_Z_CARVED_PUMPKIN;
    public static final Item UPPERCASE_A_CARVED_PUMPKIN;
    public static final Item UPPERCASE_B_CARVED_PUMPKIN;
    public static final Item UPPERCASE_C_CARVED_PUMPKIN;
    public static final Item UPPERCASE_D_CARVED_PUMPKIN;
    public static final Item UPPERCASE_E_CARVED_PUMPKIN;
    public static final Item UPPERCASE_F_CARVED_PUMPKIN;
    public static final Item UPPERCASE_G_CARVED_PUMPKIN;
    public static final Item UPPERCASE_H_CARVED_PUMPKIN;
    public static final Item UPPERCASE_I_CARVED_PUMPKIN;
    public static final Item UPPERCASE_J_CARVED_PUMPKIN;
    public static final Item UPPERCASE_K_CARVED_PUMPKIN;
    public static final Item UPPERCASE_L_CARVED_PUMPKIN;
    public static final Item UPPERCASE_M_CARVED_PUMPKIN;
    public static final Item UPPERCASE_N_CARVED_PUMPKIN;
    public static final Item UPPERCASE_O_CARVED_PUMPKIN;
    public static final Item UPPERCASE_P_CARVED_PUMPKIN;
    public static final Item UPPERCASE_Q_CARVED_PUMPKIN;
    public static final Item UPPERCASE_R_CARVED_PUMPKIN;
    public static final Item UPPERCASE_S_CARVED_PUMPKIN;
    public static final Item UPPERCASE_T_CARVED_PUMPKIN;
    public static final Item UPPERCASE_U_CARVED_PUMPKIN;
    public static final Item UPPERCASE_V_CARVED_PUMPKIN;
    public static final Item UPPERCASE_W_CARVED_PUMPKIN;
    public static final Item UPPERCASE_X_CARVED_PUMPKIN;
    public static final Item UPPERCASE_Y_CARVED_PUMPKIN;
    public static final Item UPPERCASE_Z_CARVED_PUMPKIN;

    private static Item registerItem(String name, Item item) {
        return Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, name), item);
    }

    private static Item registerBlockItem(String name, Block block) {
        return registerItem(name, new BlockItem(block, new Item.Properties()));
    }

    public static void init() {}

    static {
        SOUL_JACK_O_LANTERN = registerBlockItem("soul_jack_o_lantern", ModBlocks.SOUL_JACK_O_LANTERN);
        CREEPER_SOUL_JACK_O_LANTERN = registerBlockItem("creeper_soul_jack_o_lantern", ModBlocks.CREEPER_SOUL_JACK_O_LANTERN);
        FLOWER_SOUL_JACK_O_LANTERN = registerBlockItem("flower_soul_jack_o_lantern", ModBlocks.FLOWER_SOUL_JACK_O_LANTERN);
        GHAST_SOUL_JACK_O_LANTERN = registerBlockItem("ghast_soul_jack_o_lantern", ModBlocks.GHAST_SOUL_JACK_O_LANTERN);
        GLOBE_SOUL_JACK_O_LANTERN = registerBlockItem("globe_soul_jack_o_lantern", ModBlocks.GLOBE_SOUL_JACK_O_LANTERN);
        OBSERVER_SOUL_JACK_O_LANTERN = registerBlockItem("observer_soul_jack_o_lantern", ModBlocks.OBSERVER_SOUL_JACK_O_LANTERN);
        SKELETON_SOUL_JACK_O_LANTERN = registerBlockItem("skeleton_soul_jack_o_lantern", ModBlocks.SKELETON_SOUL_JACK_O_LANTERN);
        SNOUT_SOUL_JACK_O_LANTERN = registerBlockItem("snout_soul_jack_o_lantern", ModBlocks.SNOUT_SOUL_JACK_O_LANTERN);
        ZERO_SOUL_JACK_O_LANTERN = registerBlockItem("zero_soul_jack_o_lantern", ModBlocks.ZERO_SOUL_JACK_O_LANTERN);
        ONE_SOUL_JACK_O_LANTERN = registerBlockItem("one_soul_jack_o_lantern", ModBlocks.ONE_SOUL_JACK_O_LANTERN);
        TWO_SOUL_JACK_O_LANTERN = registerBlockItem("two_soul_jack_o_lantern", ModBlocks.TWO_SOUL_JACK_O_LANTERN);
        THREE_SOUL_JACK_O_LANTERN = registerBlockItem("three_soul_jack_o_lantern", ModBlocks.THREE_SOUL_JACK_O_LANTERN);
        FOUR_SOUL_JACK_O_LANTERN = registerBlockItem("four_soul_jack_o_lantern", ModBlocks.FOUR_SOUL_JACK_O_LANTERN);
        FIVE_SOUL_JACK_O_LANTERN = registerBlockItem("five_soul_jack_o_lantern", ModBlocks.FIVE_SOUL_JACK_O_LANTERN);
        SIX_SOUL_JACK_O_LANTERN = registerBlockItem("six_soul_jack_o_lantern", ModBlocks.SIX_SOUL_JACK_O_LANTERN);
        SEVEN_SOUL_JACK_O_LANTERN = registerBlockItem("seven_soul_jack_o_lantern", ModBlocks.SEVEN_SOUL_JACK_O_LANTERN);
        EIGHT_SOUL_JACK_O_LANTERN = registerBlockItem("eight_soul_jack_o_lantern", ModBlocks.EIGHT_SOUL_JACK_O_LANTERN);
        NINE_SOUL_JACK_O_LANTERN = registerBlockItem("nine_soul_jack_o_lantern", ModBlocks.NINE_SOUL_JACK_O_LANTERN);
        LOWERCASE_A_SOUL_JACK_O_LANTERN = registerBlockItem("lowercase_a_soul_jack_o_lantern", ModBlocks.LOWERCASE_A_SOUL_JACK_O_LANTERN);
        LOWERCASE_B_SOUL_JACK_O_LANTERN = registerBlockItem("lowercase_b_soul_jack_o_lantern", ModBlocks.LOWERCASE_B_SOUL_JACK_O_LANTERN);
        LOWERCASE_C_SOUL_JACK_O_LANTERN = registerBlockItem("lowercase_c_soul_jack_o_lantern", ModBlocks.LOWERCASE_C_SOUL_JACK_O_LANTERN);
        LOWERCASE_D_SOUL_JACK_O_LANTERN = registerBlockItem("lowercase_d_soul_jack_o_lantern", ModBlocks.LOWERCASE_D_SOUL_JACK_O_LANTERN);
        LOWERCASE_E_SOUL_JACK_O_LANTERN = registerBlockItem("lowercase_e_soul_jack_o_lantern", ModBlocks.LOWERCASE_E_SOUL_JACK_O_LANTERN);
        LOWERCASE_F_SOUL_JACK_O_LANTERN = registerBlockItem("lowercase_f_soul_jack_o_lantern", ModBlocks.LOWERCASE_F_SOUL_JACK_O_LANTERN);
        LOWERCASE_G_SOUL_JACK_O_LANTERN = registerBlockItem("lowercase_g_soul_jack_o_lantern", ModBlocks.LOWERCASE_G_SOUL_JACK_O_LANTERN);
        LOWERCASE_H_SOUL_JACK_O_LANTERN = registerBlockItem("lowercase_h_soul_jack_o_lantern", ModBlocks.LOWERCASE_H_SOUL_JACK_O_LANTERN);
        LOWERCASE_I_SOUL_JACK_O_LANTERN = registerBlockItem("lowercase_i_soul_jack_o_lantern", ModBlocks.LOWERCASE_I_SOUL_JACK_O_LANTERN);
        LOWERCASE_J_SOUL_JACK_O_LANTERN = registerBlockItem("lowercase_j_soul_jack_o_lantern", ModBlocks.LOWERCASE_J_SOUL_JACK_O_LANTERN);
        LOWERCASE_K_SOUL_JACK_O_LANTERN = registerBlockItem("lowercase_k_soul_jack_o_lantern", ModBlocks.LOWERCASE_K_SOUL_JACK_O_LANTERN);
        LOWERCASE_L_SOUL_JACK_O_LANTERN = registerBlockItem("lowercase_l_soul_jack_o_lantern", ModBlocks.LOWERCASE_L_SOUL_JACK_O_LANTERN);
        LOWERCASE_M_SOUL_JACK_O_LANTERN = registerBlockItem("lowercase_m_soul_jack_o_lantern", ModBlocks.LOWERCASE_M_SOUL_JACK_O_LANTERN);
        LOWERCASE_N_SOUL_JACK_O_LANTERN = registerBlockItem("lowercase_n_soul_jack_o_lantern", ModBlocks.LOWERCASE_N_SOUL_JACK_O_LANTERN);
        LOWERCASE_O_SOUL_JACK_O_LANTERN = registerBlockItem("lowercase_o_soul_jack_o_lantern", ModBlocks.LOWERCASE_O_SOUL_JACK_O_LANTERN);
        LOWERCASE_P_SOUL_JACK_O_LANTERN = registerBlockItem("lowercase_p_soul_jack_o_lantern", ModBlocks.LOWERCASE_P_SOUL_JACK_O_LANTERN);
        LOWERCASE_Q_SOUL_JACK_O_LANTERN = registerBlockItem("lowercase_q_soul_jack_o_lantern", ModBlocks.LOWERCASE_Q_SOUL_JACK_O_LANTERN);
        LOWERCASE_R_SOUL_JACK_O_LANTERN = registerBlockItem("lowercase_r_soul_jack_o_lantern", ModBlocks.LOWERCASE_R_SOUL_JACK_O_LANTERN);
        LOWERCASE_S_SOUL_JACK_O_LANTERN = registerBlockItem("lowercase_s_soul_jack_o_lantern", ModBlocks.LOWERCASE_S_SOUL_JACK_O_LANTERN);
        LOWERCASE_T_SOUL_JACK_O_LANTERN = registerBlockItem("lowercase_t_soul_jack_o_lantern", ModBlocks.LOWERCASE_T_SOUL_JACK_O_LANTERN);
        LOWERCASE_U_SOUL_JACK_O_LANTERN = registerBlockItem("lowercase_u_soul_jack_o_lantern", ModBlocks.LOWERCASE_U_SOUL_JACK_O_LANTERN);
        LOWERCASE_V_SOUL_JACK_O_LANTERN = registerBlockItem("lowercase_v_soul_jack_o_lantern", ModBlocks.LOWERCASE_V_SOUL_JACK_O_LANTERN);
        LOWERCASE_W_SOUL_JACK_O_LANTERN = registerBlockItem("lowercase_w_soul_jack_o_lantern", ModBlocks.LOWERCASE_W_SOUL_JACK_O_LANTERN);
        LOWERCASE_X_SOUL_JACK_O_LANTERN = registerBlockItem("lowercase_x_soul_jack_o_lantern", ModBlocks.LOWERCASE_X_SOUL_JACK_O_LANTERN);
        LOWERCASE_Y_SOUL_JACK_O_LANTERN = registerBlockItem("lowercase_y_soul_jack_o_lantern", ModBlocks.LOWERCASE_Y_SOUL_JACK_O_LANTERN);
        LOWERCASE_Z_SOUL_JACK_O_LANTERN = registerBlockItem("lowercase_z_soul_jack_o_lantern", ModBlocks.LOWERCASE_Z_SOUL_JACK_O_LANTERN);
        UPPERCASE_A_SOUL_JACK_O_LANTERN = registerBlockItem("uppercase_a_soul_jack_o_lantern", ModBlocks.UPPERCASE_A_SOUL_JACK_O_LANTERN);
        UPPERCASE_B_SOUL_JACK_O_LANTERN = registerBlockItem("uppercase_b_soul_jack_o_lantern", ModBlocks.UPPERCASE_B_SOUL_JACK_O_LANTERN);
        UPPERCASE_C_SOUL_JACK_O_LANTERN = registerBlockItem("uppercase_c_soul_jack_o_lantern", ModBlocks.UPPERCASE_C_SOUL_JACK_O_LANTERN);
        UPPERCASE_D_SOUL_JACK_O_LANTERN = registerBlockItem("uppercase_d_soul_jack_o_lantern", ModBlocks.UPPERCASE_D_SOUL_JACK_O_LANTERN);
        UPPERCASE_E_SOUL_JACK_O_LANTERN = registerBlockItem("uppercase_e_soul_jack_o_lantern", ModBlocks.UPPERCASE_E_SOUL_JACK_O_LANTERN);
        UPPERCASE_F_SOUL_JACK_O_LANTERN = registerBlockItem("uppercase_f_soul_jack_o_lantern", ModBlocks.UPPERCASE_F_SOUL_JACK_O_LANTERN);
        UPPERCASE_G_SOUL_JACK_O_LANTERN = registerBlockItem("uppercase_g_soul_jack_o_lantern", ModBlocks.UPPERCASE_G_SOUL_JACK_O_LANTERN);
        UPPERCASE_H_SOUL_JACK_O_LANTERN = registerBlockItem("uppercase_h_soul_jack_o_lantern", ModBlocks.UPPERCASE_H_SOUL_JACK_O_LANTERN);
        UPPERCASE_I_SOUL_JACK_O_LANTERN = registerBlockItem("uppercase_i_soul_jack_o_lantern", ModBlocks.UPPERCASE_I_SOUL_JACK_O_LANTERN);
        UPPERCASE_J_SOUL_JACK_O_LANTERN = registerBlockItem("uppercase_j_soul_jack_o_lantern", ModBlocks.UPPERCASE_J_SOUL_JACK_O_LANTERN);
        UPPERCASE_K_SOUL_JACK_O_LANTERN = registerBlockItem("uppercase_k_soul_jack_o_lantern", ModBlocks.UPPERCASE_K_SOUL_JACK_O_LANTERN);
        UPPERCASE_L_SOUL_JACK_O_LANTERN = registerBlockItem("uppercase_l_soul_jack_o_lantern", ModBlocks.UPPERCASE_L_SOUL_JACK_O_LANTERN);
        UPPERCASE_M_SOUL_JACK_O_LANTERN = registerBlockItem("uppercase_m_soul_jack_o_lantern", ModBlocks.UPPERCASE_M_SOUL_JACK_O_LANTERN);
        UPPERCASE_N_SOUL_JACK_O_LANTERN = registerBlockItem("uppercase_n_soul_jack_o_lantern", ModBlocks.UPPERCASE_N_SOUL_JACK_O_LANTERN);
        UPPERCASE_O_SOUL_JACK_O_LANTERN = registerBlockItem("uppercase_o_soul_jack_o_lantern", ModBlocks.UPPERCASE_O_SOUL_JACK_O_LANTERN);
        UPPERCASE_P_SOUL_JACK_O_LANTERN = registerBlockItem("uppercase_p_soul_jack_o_lantern", ModBlocks.UPPERCASE_P_SOUL_JACK_O_LANTERN);
        UPPERCASE_Q_SOUL_JACK_O_LANTERN = registerBlockItem("uppercase_q_soul_jack_o_lantern", ModBlocks.UPPERCASE_Q_SOUL_JACK_O_LANTERN);
        UPPERCASE_R_SOUL_JACK_O_LANTERN = registerBlockItem("uppercase_r_soul_jack_o_lantern", ModBlocks.UPPERCASE_R_SOUL_JACK_O_LANTERN);
        UPPERCASE_S_SOUL_JACK_O_LANTERN = registerBlockItem("uppercase_s_soul_jack_o_lantern", ModBlocks.UPPERCASE_S_SOUL_JACK_O_LANTERN);
        UPPERCASE_T_SOUL_JACK_O_LANTERN = registerBlockItem("uppercase_t_soul_jack_o_lantern", ModBlocks.UPPERCASE_T_SOUL_JACK_O_LANTERN);
        UPPERCASE_U_SOUL_JACK_O_LANTERN = registerBlockItem("uppercase_u_soul_jack_o_lantern", ModBlocks.UPPERCASE_U_SOUL_JACK_O_LANTERN);
        UPPERCASE_V_SOUL_JACK_O_LANTERN = registerBlockItem("uppercase_v_soul_jack_o_lantern", ModBlocks.UPPERCASE_V_SOUL_JACK_O_LANTERN);
        UPPERCASE_W_SOUL_JACK_O_LANTERN = registerBlockItem("uppercase_w_soul_jack_o_lantern", ModBlocks.UPPERCASE_W_SOUL_JACK_O_LANTERN);
        UPPERCASE_X_SOUL_JACK_O_LANTERN = registerBlockItem("uppercase_x_soul_jack_o_lantern", ModBlocks.UPPERCASE_X_SOUL_JACK_O_LANTERN);
        UPPERCASE_Y_SOUL_JACK_O_LANTERN = registerBlockItem("uppercase_y_soul_jack_o_lantern", ModBlocks.UPPERCASE_Y_SOUL_JACK_O_LANTERN);
        UPPERCASE_Z_SOUL_JACK_O_LANTERN = registerBlockItem("uppercase_z_soul_jack_o_lantern", ModBlocks.UPPERCASE_Z_SOUL_JACK_O_LANTERN);
        CREEPER_JACK_O_LANTERN = registerBlockItem("creeper_jack_o_lantern", ModBlocks.CREEPER_JACK_O_LANTERN);
        FLOWER_JACK_O_LANTERN = registerBlockItem("flower_jack_o_lantern", ModBlocks.FLOWER_JACK_O_LANTERN);
        GHAST_JACK_O_LANTERN = registerBlockItem("ghast_jack_o_lantern", ModBlocks.GHAST_JACK_O_LANTERN);
        GLOBE_JACK_O_LANTERN = registerBlockItem("globe_jack_o_lantern", ModBlocks.GLOBE_JACK_O_LANTERN);
        OBSERVER_JACK_O_LANTERN = registerBlockItem("observer_jack_o_lantern", ModBlocks.OBSERVER_JACK_O_LANTERN);
        SKELETON_JACK_O_LANTERN = registerBlockItem("skeleton_jack_o_lantern", ModBlocks.SKELETON_JACK_O_LANTERN);
        SNOUT_JACK_O_LANTERN = registerBlockItem("snout_jack_o_lantern", ModBlocks.SNOUT_JACK_O_LANTERN);
        ZERO_JACK_O_LANTERN = registerBlockItem("zero_jack_o_lantern", ModBlocks.ZERO_JACK_O_LANTERN);
        ONE_JACK_O_LANTERN = registerBlockItem("one_jack_o_lantern", ModBlocks.ONE_JACK_O_LANTERN);
        TWO_JACK_O_LANTERN = registerBlockItem("two_jack_o_lantern", ModBlocks.TWO_JACK_O_LANTERN);
        THREE_JACK_O_LANTERN = registerBlockItem("three_jack_o_lantern", ModBlocks.THREE_JACK_O_LANTERN);
        FOUR_JACK_O_LANTERN = registerBlockItem("four_jack_o_lantern", ModBlocks.FOUR_JACK_O_LANTERN);
        FIVE_JACK_O_LANTERN = registerBlockItem("five_jack_o_lantern", ModBlocks.FIVE_JACK_O_LANTERN);
        SIX_JACK_O_LANTERN = registerBlockItem("six_jack_o_lantern", ModBlocks.SIX_JACK_O_LANTERN);
        SEVEN_JACK_O_LANTERN = registerBlockItem("seven_jack_o_lantern", ModBlocks.SEVEN_JACK_O_LANTERN);
        EIGHT_JACK_O_LANTERN = registerBlockItem("eight_jack_o_lantern", ModBlocks.EIGHT_JACK_O_LANTERN);
        NINE_JACK_O_LANTERN = registerBlockItem("nine_jack_o_lantern", ModBlocks.NINE_JACK_O_LANTERN);
        LOWERCASE_A_JACK_O_LANTERN = registerBlockItem("lowercase_a_jack_o_lantern", ModBlocks.LOWERCASE_A_JACK_O_LANTERN);
        LOWERCASE_B_JACK_O_LANTERN = registerBlockItem("lowercase_b_jack_o_lantern", ModBlocks.LOWERCASE_B_JACK_O_LANTERN);
        LOWERCASE_C_JACK_O_LANTERN = registerBlockItem("lowercase_c_jack_o_lantern", ModBlocks.LOWERCASE_C_JACK_O_LANTERN);
        LOWERCASE_D_JACK_O_LANTERN = registerBlockItem("lowercase_d_jack_o_lantern", ModBlocks.LOWERCASE_D_JACK_O_LANTERN);
        LOWERCASE_E_JACK_O_LANTERN = registerBlockItem("lowercase_e_jack_o_lantern", ModBlocks.LOWERCASE_E_JACK_O_LANTERN);
        LOWERCASE_F_JACK_O_LANTERN = registerBlockItem("lowercase_f_jack_o_lantern", ModBlocks.LOWERCASE_F_JACK_O_LANTERN);
        LOWERCASE_G_JACK_O_LANTERN = registerBlockItem("lowercase_g_jack_o_lantern", ModBlocks.LOWERCASE_G_JACK_O_LANTERN);
        LOWERCASE_H_JACK_O_LANTERN = registerBlockItem("lowercase_h_jack_o_lantern", ModBlocks.LOWERCASE_H_JACK_O_LANTERN);
        LOWERCASE_I_JACK_O_LANTERN = registerBlockItem("lowercase_i_jack_o_lantern", ModBlocks.LOWERCASE_I_JACK_O_LANTERN);
        LOWERCASE_J_JACK_O_LANTERN = registerBlockItem("lowercase_j_jack_o_lantern", ModBlocks.LOWERCASE_J_JACK_O_LANTERN);
        LOWERCASE_K_JACK_O_LANTERN = registerBlockItem("lowercase_k_jack_o_lantern", ModBlocks.LOWERCASE_K_JACK_O_LANTERN);
        LOWERCASE_L_JACK_O_LANTERN = registerBlockItem("lowercase_l_jack_o_lantern", ModBlocks.LOWERCASE_L_JACK_O_LANTERN);
        LOWERCASE_M_JACK_O_LANTERN = registerBlockItem("lowercase_m_jack_o_lantern", ModBlocks.LOWERCASE_M_JACK_O_LANTERN);
        LOWERCASE_N_JACK_O_LANTERN = registerBlockItem("lowercase_n_jack_o_lantern", ModBlocks.LOWERCASE_N_JACK_O_LANTERN);
        LOWERCASE_O_JACK_O_LANTERN = registerBlockItem("lowercase_o_jack_o_lantern", ModBlocks.LOWERCASE_O_JACK_O_LANTERN);
        LOWERCASE_P_JACK_O_LANTERN = registerBlockItem("lowercase_p_jack_o_lantern", ModBlocks.LOWERCASE_P_JACK_O_LANTERN);
        LOWERCASE_Q_JACK_O_LANTERN = registerBlockItem("lowercase_q_jack_o_lantern", ModBlocks.LOWERCASE_Q_JACK_O_LANTERN);
        LOWERCASE_R_JACK_O_LANTERN = registerBlockItem("lowercase_r_jack_o_lantern", ModBlocks.LOWERCASE_R_JACK_O_LANTERN);
        LOWERCASE_S_JACK_O_LANTERN = registerBlockItem("lowercase_s_jack_o_lantern", ModBlocks.LOWERCASE_S_JACK_O_LANTERN);
        LOWERCASE_T_JACK_O_LANTERN = registerBlockItem("lowercase_t_jack_o_lantern", ModBlocks.LOWERCASE_T_JACK_O_LANTERN);
        LOWERCASE_U_JACK_O_LANTERN = registerBlockItem("lowercase_u_jack_o_lantern", ModBlocks.LOWERCASE_U_JACK_O_LANTERN);
        LOWERCASE_V_JACK_O_LANTERN = registerBlockItem("lowercase_v_jack_o_lantern", ModBlocks.LOWERCASE_V_JACK_O_LANTERN);
        LOWERCASE_W_JACK_O_LANTERN = registerBlockItem("lowercase_w_jack_o_lantern", ModBlocks.LOWERCASE_W_JACK_O_LANTERN);
        LOWERCASE_X_JACK_O_LANTERN = registerBlockItem("lowercase_x_jack_o_lantern", ModBlocks.LOWERCASE_X_JACK_O_LANTERN);
        LOWERCASE_Y_JACK_O_LANTERN = registerBlockItem("lowercase_y_jack_o_lantern", ModBlocks.LOWERCASE_Y_JACK_O_LANTERN);
        LOWERCASE_Z_JACK_O_LANTERN = registerBlockItem("lowercase_z_jack_o_lantern", ModBlocks.LOWERCASE_Z_JACK_O_LANTERN);
        UPPERCASE_A_JACK_O_LANTERN = registerBlockItem("uppercase_a_jack_o_lantern", ModBlocks.UPPERCASE_A_JACK_O_LANTERN);
        UPPERCASE_B_JACK_O_LANTERN = registerBlockItem("uppercase_b_jack_o_lantern", ModBlocks.UPPERCASE_B_JACK_O_LANTERN);
        UPPERCASE_C_JACK_O_LANTERN = registerBlockItem("uppercase_c_jack_o_lantern", ModBlocks.UPPERCASE_C_JACK_O_LANTERN);
        UPPERCASE_D_JACK_O_LANTERN = registerBlockItem("uppercase_d_jack_o_lantern", ModBlocks.UPPERCASE_D_JACK_O_LANTERN);
        UPPERCASE_E_JACK_O_LANTERN = registerBlockItem("uppercase_e_jack_o_lantern", ModBlocks.UPPERCASE_E_JACK_O_LANTERN);
        UPPERCASE_F_JACK_O_LANTERN = registerBlockItem("uppercase_f_jack_o_lantern", ModBlocks.UPPERCASE_F_JACK_O_LANTERN);
        UPPERCASE_G_JACK_O_LANTERN = registerBlockItem("uppercase_g_jack_o_lantern", ModBlocks.UPPERCASE_G_JACK_O_LANTERN);
        UPPERCASE_H_JACK_O_LANTERN = registerBlockItem("uppercase_h_jack_o_lantern", ModBlocks.UPPERCASE_H_JACK_O_LANTERN);
        UPPERCASE_I_JACK_O_LANTERN = registerBlockItem("uppercase_i_jack_o_lantern", ModBlocks.UPPERCASE_I_JACK_O_LANTERN);
        UPPERCASE_J_JACK_O_LANTERN = registerBlockItem("uppercase_j_jack_o_lantern", ModBlocks.UPPERCASE_J_JACK_O_LANTERN);
        UPPERCASE_K_JACK_O_LANTERN = registerBlockItem("uppercase_k_jack_o_lantern", ModBlocks.UPPERCASE_K_JACK_O_LANTERN);
        UPPERCASE_L_JACK_O_LANTERN = registerBlockItem("uppercase_l_jack_o_lantern", ModBlocks.UPPERCASE_L_JACK_O_LANTERN);
        UPPERCASE_M_JACK_O_LANTERN = registerBlockItem("uppercase_m_jack_o_lantern", ModBlocks.UPPERCASE_M_JACK_O_LANTERN);
        UPPERCASE_N_JACK_O_LANTERN = registerBlockItem("uppercase_n_jack_o_lantern", ModBlocks.UPPERCASE_N_JACK_O_LANTERN);
        UPPERCASE_O_JACK_O_LANTERN = registerBlockItem("uppercase_o_jack_o_lantern", ModBlocks.UPPERCASE_O_JACK_O_LANTERN);
        UPPERCASE_P_JACK_O_LANTERN = registerBlockItem("uppercase_p_jack_o_lantern", ModBlocks.UPPERCASE_P_JACK_O_LANTERN);
        UPPERCASE_Q_JACK_O_LANTERN = registerBlockItem("uppercase_q_jack_o_lantern", ModBlocks.UPPERCASE_Q_JACK_O_LANTERN);
        UPPERCASE_R_JACK_O_LANTERN = registerBlockItem("uppercase_r_jack_o_lantern", ModBlocks.UPPERCASE_R_JACK_O_LANTERN);
        UPPERCASE_S_JACK_O_LANTERN = registerBlockItem("uppercase_s_jack_o_lantern", ModBlocks.UPPERCASE_S_JACK_O_LANTERN);
        UPPERCASE_T_JACK_O_LANTERN = registerBlockItem("uppercase_t_jack_o_lantern", ModBlocks.UPPERCASE_T_JACK_O_LANTERN);
        UPPERCASE_U_JACK_O_LANTERN = registerBlockItem("uppercase_u_jack_o_lantern", ModBlocks.UPPERCASE_U_JACK_O_LANTERN);
        UPPERCASE_V_JACK_O_LANTERN = registerBlockItem("uppercase_v_jack_o_lantern", ModBlocks.UPPERCASE_V_JACK_O_LANTERN);
        UPPERCASE_W_JACK_O_LANTERN = registerBlockItem("uppercase_w_jack_o_lantern", ModBlocks.UPPERCASE_W_JACK_O_LANTERN);
        UPPERCASE_X_JACK_O_LANTERN = registerBlockItem("uppercase_x_jack_o_lantern", ModBlocks.UPPERCASE_X_JACK_O_LANTERN);
        UPPERCASE_Y_JACK_O_LANTERN = registerBlockItem("uppercase_y_jack_o_lantern", ModBlocks.UPPERCASE_Y_JACK_O_LANTERN);
        UPPERCASE_Z_JACK_O_LANTERN = registerBlockItem("uppercase_z_jack_o_lantern", ModBlocks.UPPERCASE_Z_JACK_O_LANTERN);
        CREEPER_CARVED_PUMPKIN = registerBlockItem("creeper_carved_pumpkin", ModBlocks.CREEPER_CARVED_PUMPKIN);
        FLOWER_CARVED_PUMPKIN = registerBlockItem("flower_carved_pumpkin", ModBlocks.FLOWER_CARVED_PUMPKIN);
        GHAST_CARVED_PUMPKIN = registerBlockItem("ghast_carved_pumpkin", ModBlocks.GHAST_CARVED_PUMPKIN);
        GLOBE_CARVED_PUMPKIN = registerBlockItem("globe_carved_pumpkin", ModBlocks.GLOBE_CARVED_PUMPKIN);
        OBSERVER_CARVED_PUMPKIN = registerBlockItem("observer_carved_pumpkin", ModBlocks.OBSERVER_CARVED_PUMPKIN);
        SKELETON_CARVED_PUMPKIN = registerBlockItem("skeleton_carved_pumpkin", ModBlocks.SKELETON_CARVED_PUMPKIN);
        SNOUT_CARVED_PUMPKIN = registerBlockItem("snout_carved_pumpkin", ModBlocks.SNOUT_CARVED_PUMPKIN);
        ZERO_CARVED_PUMPKIN = registerBlockItem("zero_carved_pumpkin", ModBlocks.ZERO_CARVED_PUMPKIN);
        ONE_CARVED_PUMPKIN = registerBlockItem("one_carved_pumpkin", ModBlocks.ONE_CARVED_PUMPKIN);
        TWO_CARVED_PUMPKIN = registerBlockItem("two_carved_pumpkin", ModBlocks.TWO_CARVED_PUMPKIN);
        THREE_CARVED_PUMPKIN = registerBlockItem("three_carved_pumpkin", ModBlocks.THREE_CARVED_PUMPKIN);
        FOUR_CARVED_PUMPKIN = registerBlockItem("four_carved_pumpkin", ModBlocks.FOUR_CARVED_PUMPKIN);
        FIVE_CARVED_PUMPKIN = registerBlockItem("five_carved_pumpkin", ModBlocks.FIVE_CARVED_PUMPKIN);
        SIX_CARVED_PUMPKIN = registerBlockItem("six_carved_pumpkin", ModBlocks.SIX_CARVED_PUMPKIN);
        SEVEN_CARVED_PUMPKIN = registerBlockItem("seven_carved_pumpkin", ModBlocks.SEVEN_CARVED_PUMPKIN);
        EIGHT_CARVED_PUMPKIN = registerBlockItem("eight_carved_pumpkin", ModBlocks.EIGHT_CARVED_PUMPKIN);
        NINE_CARVED_PUMPKIN = registerBlockItem("nine_carved_pumpkin", ModBlocks.NINE_CARVED_PUMPKIN);
        LOWERCASE_A_CARVED_PUMPKIN = registerBlockItem("lowercase_a_carved_pumpkin", ModBlocks.LOWERCASE_A_CARVED_PUMPKIN);
        LOWERCASE_B_CARVED_PUMPKIN = registerBlockItem("lowercase_b_carved_pumpkin", ModBlocks.LOWERCASE_B_CARVED_PUMPKIN);
        LOWERCASE_C_CARVED_PUMPKIN = registerBlockItem("lowercase_c_carved_pumpkin", ModBlocks.LOWERCASE_C_CARVED_PUMPKIN);
        LOWERCASE_D_CARVED_PUMPKIN = registerBlockItem("lowercase_d_carved_pumpkin", ModBlocks.LOWERCASE_D_CARVED_PUMPKIN);
        LOWERCASE_E_CARVED_PUMPKIN = registerBlockItem("lowercase_e_carved_pumpkin", ModBlocks.LOWERCASE_E_CARVED_PUMPKIN);
        LOWERCASE_F_CARVED_PUMPKIN = registerBlockItem("lowercase_f_carved_pumpkin", ModBlocks.LOWERCASE_F_CARVED_PUMPKIN);
        LOWERCASE_G_CARVED_PUMPKIN = registerBlockItem("lowercase_g_carved_pumpkin", ModBlocks.LOWERCASE_G_CARVED_PUMPKIN);
        LOWERCASE_H_CARVED_PUMPKIN = registerBlockItem("lowercase_h_carved_pumpkin", ModBlocks.LOWERCASE_H_CARVED_PUMPKIN);
        LOWERCASE_I_CARVED_PUMPKIN = registerBlockItem("lowercase_i_carved_pumpkin", ModBlocks.LOWERCASE_I_CARVED_PUMPKIN);
        LOWERCASE_J_CARVED_PUMPKIN = registerBlockItem("lowercase_j_carved_pumpkin", ModBlocks.LOWERCASE_J_CARVED_PUMPKIN);
        LOWERCASE_K_CARVED_PUMPKIN = registerBlockItem("lowercase_k_carved_pumpkin", ModBlocks.LOWERCASE_K_CARVED_PUMPKIN);
        LOWERCASE_L_CARVED_PUMPKIN = registerBlockItem("lowercase_l_carved_pumpkin", ModBlocks.LOWERCASE_L_CARVED_PUMPKIN);
        LOWERCASE_M_CARVED_PUMPKIN = registerBlockItem("lowercase_m_carved_pumpkin", ModBlocks.LOWERCASE_M_CARVED_PUMPKIN);
        LOWERCASE_N_CARVED_PUMPKIN = registerBlockItem("lowercase_n_carved_pumpkin", ModBlocks.LOWERCASE_N_CARVED_PUMPKIN);
        LOWERCASE_O_CARVED_PUMPKIN = registerBlockItem("lowercase_o_carved_pumpkin", ModBlocks.LOWERCASE_O_CARVED_PUMPKIN);
        LOWERCASE_P_CARVED_PUMPKIN = registerBlockItem("lowercase_p_carved_pumpkin", ModBlocks.LOWERCASE_P_CARVED_PUMPKIN);
        LOWERCASE_Q_CARVED_PUMPKIN = registerBlockItem("lowercase_q_carved_pumpkin", ModBlocks.LOWERCASE_Q_CARVED_PUMPKIN);
        LOWERCASE_R_CARVED_PUMPKIN = registerBlockItem("lowercase_r_carved_pumpkin", ModBlocks.LOWERCASE_R_CARVED_PUMPKIN);
        LOWERCASE_S_CARVED_PUMPKIN = registerBlockItem("lowercase_s_carved_pumpkin", ModBlocks.LOWERCASE_S_CARVED_PUMPKIN);
        LOWERCASE_T_CARVED_PUMPKIN = registerBlockItem("lowercase_t_carved_pumpkin", ModBlocks.LOWERCASE_T_CARVED_PUMPKIN);
        LOWERCASE_U_CARVED_PUMPKIN = registerBlockItem("lowercase_u_carved_pumpkin", ModBlocks.LOWERCASE_U_CARVED_PUMPKIN);
        LOWERCASE_V_CARVED_PUMPKIN = registerBlockItem("lowercase_v_carved_pumpkin", ModBlocks.LOWERCASE_V_CARVED_PUMPKIN);
        LOWERCASE_W_CARVED_PUMPKIN = registerBlockItem("lowercase_w_carved_pumpkin", ModBlocks.LOWERCASE_W_CARVED_PUMPKIN);
        LOWERCASE_X_CARVED_PUMPKIN = registerBlockItem("lowercase_x_carved_pumpkin", ModBlocks.LOWERCASE_X_CARVED_PUMPKIN);
        LOWERCASE_Y_CARVED_PUMPKIN = registerBlockItem("lowercase_y_carved_pumpkin", ModBlocks.LOWERCASE_Y_CARVED_PUMPKIN);
        LOWERCASE_Z_CARVED_PUMPKIN = registerBlockItem("lowercase_z_carved_pumpkin", ModBlocks.LOWERCASE_Z_CARVED_PUMPKIN);
        UPPERCASE_A_CARVED_PUMPKIN = registerBlockItem("uppercase_a_carved_pumpkin", ModBlocks.UPPERCASE_A_CARVED_PUMPKIN);
        UPPERCASE_B_CARVED_PUMPKIN = registerBlockItem("uppercase_b_carved_pumpkin", ModBlocks.UPPERCASE_B_CARVED_PUMPKIN);
        UPPERCASE_C_CARVED_PUMPKIN = registerBlockItem("uppercase_c_carved_pumpkin", ModBlocks.UPPERCASE_C_CARVED_PUMPKIN);
        UPPERCASE_D_CARVED_PUMPKIN = registerBlockItem("uppercase_d_carved_pumpkin", ModBlocks.UPPERCASE_D_CARVED_PUMPKIN);
        UPPERCASE_E_CARVED_PUMPKIN = registerBlockItem("uppercase_e_carved_pumpkin", ModBlocks.UPPERCASE_E_CARVED_PUMPKIN);
        UPPERCASE_F_CARVED_PUMPKIN = registerBlockItem("uppercase_f_carved_pumpkin", ModBlocks.UPPERCASE_F_CARVED_PUMPKIN);
        UPPERCASE_G_CARVED_PUMPKIN = registerBlockItem("uppercase_g_carved_pumpkin", ModBlocks.UPPERCASE_G_CARVED_PUMPKIN);
        UPPERCASE_H_CARVED_PUMPKIN = registerBlockItem("uppercase_h_carved_pumpkin", ModBlocks.UPPERCASE_H_CARVED_PUMPKIN);
        UPPERCASE_I_CARVED_PUMPKIN = registerBlockItem("uppercase_i_carved_pumpkin", ModBlocks.UPPERCASE_I_CARVED_PUMPKIN);
        UPPERCASE_J_CARVED_PUMPKIN = registerBlockItem("uppercase_j_carved_pumpkin", ModBlocks.UPPERCASE_J_CARVED_PUMPKIN);
        UPPERCASE_K_CARVED_PUMPKIN = registerBlockItem("uppercase_k_carved_pumpkin", ModBlocks.UPPERCASE_K_CARVED_PUMPKIN);
        UPPERCASE_L_CARVED_PUMPKIN = registerBlockItem("uppercase_l_carved_pumpkin", ModBlocks.UPPERCASE_L_CARVED_PUMPKIN);
        UPPERCASE_M_CARVED_PUMPKIN = registerBlockItem("uppercase_m_carved_pumpkin", ModBlocks.UPPERCASE_M_CARVED_PUMPKIN);
        UPPERCASE_N_CARVED_PUMPKIN = registerBlockItem("uppercase_n_carved_pumpkin", ModBlocks.UPPERCASE_N_CARVED_PUMPKIN);
        UPPERCASE_O_CARVED_PUMPKIN = registerBlockItem("uppercase_o_carved_pumpkin", ModBlocks.UPPERCASE_O_CARVED_PUMPKIN);
        UPPERCASE_P_CARVED_PUMPKIN = registerBlockItem("uppercase_p_carved_pumpkin", ModBlocks.UPPERCASE_P_CARVED_PUMPKIN);
        UPPERCASE_Q_CARVED_PUMPKIN = registerBlockItem("uppercase_q_carved_pumpkin", ModBlocks.UPPERCASE_Q_CARVED_PUMPKIN);
        UPPERCASE_R_CARVED_PUMPKIN = registerBlockItem("uppercase_r_carved_pumpkin", ModBlocks.UPPERCASE_R_CARVED_PUMPKIN);
        UPPERCASE_S_CARVED_PUMPKIN = registerBlockItem("uppercase_s_carved_pumpkin", ModBlocks.UPPERCASE_S_CARVED_PUMPKIN);
        UPPERCASE_T_CARVED_PUMPKIN = registerBlockItem("uppercase_t_carved_pumpkin", ModBlocks.UPPERCASE_T_CARVED_PUMPKIN);
        UPPERCASE_U_CARVED_PUMPKIN = registerBlockItem("uppercase_u_carved_pumpkin", ModBlocks.UPPERCASE_U_CARVED_PUMPKIN);
        UPPERCASE_V_CARVED_PUMPKIN = registerBlockItem("uppercase_v_carved_pumpkin", ModBlocks.UPPERCASE_V_CARVED_PUMPKIN);
        UPPERCASE_W_CARVED_PUMPKIN = registerBlockItem("uppercase_w_carved_pumpkin", ModBlocks.UPPERCASE_W_CARVED_PUMPKIN);
        UPPERCASE_X_CARVED_PUMPKIN = registerBlockItem("uppercase_x_carved_pumpkin", ModBlocks.UPPERCASE_X_CARVED_PUMPKIN);
        UPPERCASE_Y_CARVED_PUMPKIN = registerBlockItem("uppercase_y_carved_pumpkin", ModBlocks.UPPERCASE_Y_CARVED_PUMPKIN);
        UPPERCASE_Z_CARVED_PUMPKIN = registerBlockItem("uppercase_z_carved_pumpkin", ModBlocks.UPPERCASE_Z_CARVED_PUMPKIN);
    }
}