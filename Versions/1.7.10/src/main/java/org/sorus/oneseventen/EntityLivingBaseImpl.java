/*
 * MIT License
 *
 * Copyright (c) 2020 Danterus
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.sorus.oneseventen;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.PotionEffect;
import org.sorus.client.version.game.ILivingEntity;
import org.sorus.client.version.game.IPotionEffect;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class EntityLivingBaseImpl extends EntityImpl implements ILivingEntity {

    public EntityLivingBaseImpl(Entity entity) {
        super(entity);
    }

    @Override
    public List<IPotionEffect> getActivePotionEffects() {
        List<IPotionEffect> potionEffects = new ArrayList<>();
        for(PotionEffect potionEffect : (Collection<PotionEffect>) ((EntityLivingBase) this.entity).getActivePotionEffects()) {
            potionEffects.add(new PotionEffectImpl(potionEffect));
        }
        return potionEffects;
    }

}
