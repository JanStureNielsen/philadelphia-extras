/*
 * Copyright 2016 Philadelphia authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.paritytrading.philadelphia.iex;

/**
 * Tags for IEX FIX 2.3.
 *
 * <p>See Section 1.2.1 of the specification.</p>
 */
public class IEXTags {

    public static final int LastLiquidityInd           =  851;
    public static final int AntiInternalizationGroupID = 7928;
    public static final int InvestorID                 = 8484;
    public static final int MinQtyInstruction          = 9500;
    public static final int TradeLiquidityIndicator    = 9730;

    private IEXTags() {
    }

}
