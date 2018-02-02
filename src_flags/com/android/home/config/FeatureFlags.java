/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.home.config;

/**
 * Defines a set of flags used to control various launcher behaviors
 */
public final class FeatureFlags extends BaseFlags {

    // When enabled while all-apps open, the soft input will be set to adjust resize.
    public static final boolean HOME_UPDATE_SOFT_INPUT_MODE = true;

    // When enabled, icons not supporting {@link AdaptiveIconDrawable} will be wrapped in {@link FixedScaleDrawable}.
    public static final boolean LEGACY_ICON_TREATMENT = false;

    private FeatureFlags() {}
}
