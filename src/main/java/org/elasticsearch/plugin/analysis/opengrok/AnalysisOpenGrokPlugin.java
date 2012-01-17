package org.elasticsearch.plugin.analysis.opengrok;

import org.elasticsearch.common.inject.Module;
import org.elasticsearch.index.analysis.AnalysisModule;
import org.elasticsearch.index.analysis.OpenGrokAnalysisBinderProcessor;
import org.elasticsearch.plugins.AbstractPlugin;

public class AnalysisOpenGrokPlugin extends AbstractPlugin {
    @Override
    public String name() {
        return "analysis-opengrok";
    }

    @Override
    public String description() {
        return "Provides OpenGrok as a tokenizer";
    }

    @Override
    public void processModule(Module module) {
        if (module instanceof AnalysisModule) {
            AnalysisModule analysisModule = (AnalysisModule) module;
            analysisModule.addProcessor(new OpenGrokAnalysisBinderProcessor());
        }
    }
}